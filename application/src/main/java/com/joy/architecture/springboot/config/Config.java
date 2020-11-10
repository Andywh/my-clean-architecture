package com.joy.architecture.springboot.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joy.architecture.config.SpringConfig;
import com.joy.architecture.controller.UserController;
import com.joy.architecture.usecase.CreateUser;
import com.joy.architecture.usecase.FindUser;
import com.joy.architecture.usecase.LoginUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Andy
 * @date 2020/11/10
 **/
@Configuration
public class Config {

    private final SpringConfig config = new SpringConfig();

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    @Bean
    public CreateUser createUser() {
        return config.createUser();
    }

    @Bean
    public FindUser findUser() {
        return config.findUser();
    }

    @Bean
    public LoginUser loginUser() {
        return config.loginUser();
    }

    @Bean
    public UserController userController() {
        return new UserController(createUser(), findUser(), loginUser());
    }

}
