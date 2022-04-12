package com.example.configproperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ConfigurationProperties(prefix="shoppingcart")
@Configuration
@Data
//@NoArgsConstructor
public class configProperty {
     String type;
     String channel;
     int version;
     boolean update;

}
