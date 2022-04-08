package com.charactorcreator.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CharacterCreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharacterCreatorApplication.class, args);
    }

}
