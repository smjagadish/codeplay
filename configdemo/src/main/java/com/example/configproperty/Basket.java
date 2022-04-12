package com.example.configproperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix="basket")
@Configuration
//@NoArgsConstructor
public class Basket {

    private String type;
    private String integration;
    private boolean leaf;
    @Autowired

    private Attribute attribute;

}
