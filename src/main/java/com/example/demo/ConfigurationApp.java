package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationApp {


    @Bean("wall")
    @Scope("prototype")
    public Brick bricks(){
        return new Brick();

    }

    @Bean("wall")
    @Scope("prototype")
    public  Log log(){
        return new Log();
    }
    @Bean
    public WoodFrameWindow woodFrameWindow(){
        return new WoodFrameWindow();
    }

    @Bean
    public House house(){
        House house= new House(woodFrameWindow());
        house.setHeight(2);
        return house;
    }
    /*
    @Bean
    public PersonBean Person(){
        return new PersonBean("Sergey", 47);
    }*/
}
