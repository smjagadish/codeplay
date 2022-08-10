package com.example.configproperty;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Configuration
@ConfigurationProperties(prefix = "relatedparty")
@Data
 public class relatedparty {
    private int id;
    private String type;
    private relatedentity relatedentity = new relatedentity();
    private List<Integer> variant ;// = new ArrayList<>();

    @Data
    public static class relatedentity
    {
         boolean present;
         String type;
         float factor;
    }

}
