package com.example.configproperty;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "relatedparty")
@Data
public class relatedparty {
    private int id;
    private String type;
    private relatedentity relatedentity = new relatedentity();
    private List<Integer> variant;

    @Data
    public class relatedentity
    {
         boolean present;
         String type;
         float factor;
    }

}
