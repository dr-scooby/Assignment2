package com.jah.jismailassignment2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Name: Jahangir Ismail
 * ID: A00036852
 * Assignment 2
 * WebController to handle REST requests
 */
@RestController
public class Controller {


    @Autowired
    private Configz conz;


    // end point url: localhost:8080/foo
    @GetMapping("/foo")
    public String getReply(){
        return "bar";
    }


    // end point url: localhost:8080/hello
    @PostMapping("/hello")
    public String getHello(@RequestBody User user){
        // get the data from the client body - JSON, and convert to User class
        User auser = user;
        System.out.println("\n\nGot user:: " + auser.getName());
        // return the user name
        return "hello " + auser.getName() + "!\n";

    }


    @GetMapping("/configValue")
    public String getConfigValue(){
        return conz.getConfigValue();
    }


    @GetMapping("/secretValue")
    public String getSecretValue(){
        return conz.getSecretValue();
    }


    @GetMapping("/envValue")
    public String getEnValue(){
        return conz.getEnvValue();
    }

    @GetMapping("/all")
    public String getAll(){
        return "Configz{" +
                "configValue='" + conz.getConfigValue() + '\'' +
                ", message='" + conz.getMessage() + '\'' +
                ", secretValue='" + conz.getSecretValue() + '\'' +
                ", envValue='" + conz.getEnvValue() + '\'' +
                '}';
    }
}
