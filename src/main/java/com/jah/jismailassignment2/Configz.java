package com.jah.jismailassignment2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Configz {

    // inject values from the application.properties, testing only

    // injects hello@gmail.com
    @Value("${email.smtp.username}")
    private String username;


    @Value("${configvalue}")
    private String configValue;

    @Value("${message}")
    private String message;


    @Value("${secretvalue}")
    private String secretValue;

    @Value("${envvalue}")
    private String envValue;



    public Configz() {
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSecretValue() {
        return secretValue;
    }

    public void setSecretValue(String secretValue) {
        this.secretValue = secretValue;
    }

    public String getEnvValue() {
        return envValue;
    }

    public void setEnvValue(String envValue) {
        this.envValue = envValue;
    }

    @Override
    public String toString() {
        return "Configz{" +
                "configValue='" + configValue + '\'' +
                ", message='" + message + '\'' +
                ", secretValue='" + secretValue + '\'' +
                '}';
    }
}
