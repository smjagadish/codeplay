package com.dailytil.springbootplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringbootplayApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootplayApplication.class, args);
		Test obj = ctx.getBean(Test.class);
System.out.println(obj.type+" "+obj.upgradeable+" "+obj.version);
System.out.println(obj.printInfo());
obj.updatedep();

	}
	@Component
	public class Test{
		@Value("${deployment.type}")
		 private  String type;
		@Value("${deployment.upgradeable}")
		 private boolean upgradeable;
		@Value("${deployment.version}")
		 private final int version = 23;
		@Autowired
		public SecondTest st;
		Test(@Value("${deployment.version}")int a , final SecondTest stt)
		{
System.out.println(this.type);
//st.upgradeable = false;
		}
		private boolean printInfo()
		{

			return st.upgradeable;
		}
		private void updatedep()
		{
			st.upgradeable = false;
			System.out.println("updated" + st.upgradeable);
		}

	}

	@Component
	public class SecondTest{
		@Value("${deployment.upgradeable}")
		private boolean upgradeable;
		@Value("${deployment.version}")
		private int version;

	}
}
