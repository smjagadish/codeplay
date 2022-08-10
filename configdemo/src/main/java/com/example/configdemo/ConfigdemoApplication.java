package com.example.configdemo;

import com.example.configBean.AppLauncher;
import com.example.configproperty.appConfig;
import com.example.configproperty.configProperty;
import com.example.configproperty.relatedparty;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.Properties;

@SpringBootApplication
//@ConfigurationPropertiesScan("com.example.configproperty")
@ComponentScan("com.example.configBean")
@ComponentScan("com.example.configproperty")

public class ConfigdemoApplication {


	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ConfigdemoApplication.class);
		Properties props = new Properties();
		props.put("series","1");
		app.setDefaultProperties(props);
		app.setAdditionalProfiles("prod");
		ApplicationContext ctx = app.run(args);

		String channel = ctx.getBean(appConfig.class).getBasket().getAttribute().getType();
		System.out.print(channel);
		relatedparty obj = ctx.getBean(appConfig.class).getRelatedparty();
		System.out.println(obj.getVariant().get(0));
		System.out.println(obj.getRelatedentity().getFactor());
		System.out.print(ctx.getBean(inner.class).ver);





	}
	@Component
	private class inner
	{
       @Value("${series}")
		int ver;

	}
}


