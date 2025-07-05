package spring.aop.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public class User{
        private String name;
        private int age;
        private String address;
    }

     private User user;
    public UserService(){
        user = new User("John Doe", 30, "123 Main St");
    }

    public void logIn(){
        System.out.println("User logged in");
    }
    public void logOut() throws Exception{
        System.out.println("User logged out");
        throw new Exception("Logout failed");
    }

    }
