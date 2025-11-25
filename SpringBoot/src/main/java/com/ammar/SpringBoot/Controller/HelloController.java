package com.ammar.SpringBoot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // ANNOTATION 2: @GetMapping("/test")
    // This is a line item on the Menu.
    // It says: "If a customer goes to http://localhost:8080/, run this method."
    @GetMapping("/api")
    public String welcomeMessage(){
        return "Hello, Lets start our first Project";
    }

    // ANNOTATION 3: @RequestParam
    // This is taking an order with specific instructions.
    // URL: http://localhost:8080/greet?userName=Ammar
    @GetMapping("/greet")
    public String greetUser(@RequestParam String userName){
        return "Hello "+userName+"!";
    }

    //Assignment
    @GetMapping("/calculate")
    public String calculateSum(@RequestParam int v1,@RequestParam int v2){
        return "Your sum is: "+ (v1+v2);
    }

}
