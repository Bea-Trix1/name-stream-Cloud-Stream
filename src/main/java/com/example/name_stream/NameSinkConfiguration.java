package com.example.name_stream;

import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

public class NameSinkConfiguration {
    
    @Bean
    public Consumer<Person> nameSink(){
        return person -> {
            System.out.println(person.name());
            System.out.println(person.processedTimestamp());
        };

    }
}
