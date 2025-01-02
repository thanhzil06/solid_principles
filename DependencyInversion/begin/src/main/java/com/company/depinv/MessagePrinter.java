package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();		//creates formatter
		// Now we see this method violates the Dependency Inversion principle.
		// What if requirement asks for HTMLformatter() -> Change code :) you suck.
		try(
			PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
			// Now we see that this class not only depends on JSONFormatter() class, 
			// but also the PrintWriter() class. -> Same question above - if we want to use System.out.println()?			
			/* SUMMARY
			 * In order to develop new feature for writeMessage() class,
			 * we have to know about those concrete classes inside it,
			 * and this creates a tight coupling between methods. 
			 */

			writer.println(formatter.format(msg)); 		//formats and writes message
			writer.flush();
		}
	}
}
