package com.example.configproperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix="basket.attribute")
//@NoArgsConstructor
public class Attribute {
    String type;
    String limit;
}
