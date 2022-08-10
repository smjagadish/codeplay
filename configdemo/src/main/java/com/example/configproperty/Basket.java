package com.example.configproperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@ConfigurationProperties(prefix="basket")
@Configuration
@Validated
//@NoArgsConstructor
public class Basket {

    @NotNull
    private String type;
    @NotNull
    private String integration;
    private boolean leaf;
    @Autowired

    private Attribute attribute;

}
