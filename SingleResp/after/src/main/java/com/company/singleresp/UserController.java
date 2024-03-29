package com.company.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

// Handles incoming JSON (a message format) requests that work on User resource/entity.
//--> Which means, this class will get requests from the clients
//--> and process those requests and send out the responses to clients.
public class UserController {
	// Store used by controller
    //private Store store = new Store();
    
    // Create a new user
    public String createUser(String userJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();        
        User user = mapper.readValue(userJson, User.class);

        UserValidator validator = new UserValidator();
        //boolean valid = validator.validateUser(user); // More efficiency way. Check at UserValidator class.
        boolean valid = validator.getValidUser(user);

        if(!valid) {
            return "ERROR";
        }

        //store.store(user);  // UserController still gets impacted if developer changes the way User stored
        UserService userService = new UserService();
        userService.saveUser(user);
                    
        return "SUCCESS";
    } 


}