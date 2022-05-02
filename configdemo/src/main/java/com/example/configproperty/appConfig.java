package com.example.configproperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Data
@Configuration

//@NoArgsConstructor

public class appConfig {



    @Autowired

    private Basket basket;

    @Autowired

    private configProperty shoppingcart;

    @Autowired

    private relatedparty relatedparty;


}
