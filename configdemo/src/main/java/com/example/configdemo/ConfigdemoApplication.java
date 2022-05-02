package com.example.configdemo;

import com.example.configBean.AppLauncher;
import com.example.configproperty.appConfig;
import com.example.configproperty.configProperty;
import com.example.configproperty.relatedparty;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ConfigurationPropertiesScan("com.example.configproperty")
@ComponentScan("com.example.configBean")
@ComponentScan("com.example.configproperty")

public class ConfigdemoApplication {


	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ConfigdemoApplication.class, args);

	//	String data = ctx.getBean(AppLauncher.class).toString();
	//	System.out.print(data);
	//	System.out.print(ctx.getBean(inner.class).toString());
		String channel = ctx.getBean(appConfig.class).getShoppingcart().getChannel();
		System.out.print(channel);
		Object obj = ctx.getBean(appConfig.class).getRelatedparty();
		System.out.println(obj.toString());




	}
	@Component
	private class inner
	{

	}
}


