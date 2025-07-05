package spring.aop.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.aop.service.UserService;

@RestController
public class Api {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String userLogin(){
        userService.logIn();
        return "User logged in successfully";
    }
}
