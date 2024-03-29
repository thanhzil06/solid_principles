package com.company.singleresp;

// To store User
// This class will only change if we change the way we store User Object
// Class này khác với class Store ở điểm:
//  Store giống như 1 kho chứa, chỉ có nhiệm vụ lưu trữ thuần user-name và user vào HashMap
//  UserService ngoài store user thì vừa có thể saveUser, vừa làm vài điều linh tinh khác
//      chẳng hạn như in tên User ra trên UI dùng getUser hoặc encode user-password 
public class UserService {
    private Store store = new Store();

    public void saveUser(User user){
        store.store(user);
    }
	
}
