package com.dailytil.springbootplay;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringbootplayApplication {


	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringbootplayApplication.class, args);

		Test obj = ctx.getBean(Test.class);
		System.out.println(obj.type+" "+obj.upgradeable+" "+obj.version);
        System.out.println(obj.printInfo());
        obj.updatedep();
configFeed data = ctx.getBean(configFeed.class);
System.out.println(data.isBc() + " " + data.getType() + " " + data.getVersion());
System.out.println(obj.cf.getCfst().version);

	}
	@Component
	public class Test{
		@Autowired
		private configFeed cf;
		@Value("${deployment.type}")
		 private  String type;
		@Value("${deployment.upgradeable}")
		 private boolean upgradeable;
		@Value("${deployment.version}")
		 private  int version ;
	//	@Autowired
		public final SecondTest st;


	  //  @Autowired
		Test(@Value("${deployment.version}")int a , final SecondTest stt)
		{
System.out.println(this.type);
this.st = stt;
st.upgradeable = false;
		}
		Test(final SecondTest stt)
		{
this.st =stt;
		}
		@Autowired(required = false)
		Test(@Value("${deployment.version}")int a )
		{
			this.st = null;
			System.out.println(this.type);

		}
		private boolean printInfo()
		{

			return st.upgradeable;
		}
		private void updatedep()
		{
		//	st.upgradeable = false;
			System.out.println("updated" + st.upgradeable);
		}
		//@Autowired
		private void setSecondTest(final SecondTest st)
		{
        //  this.st = st;
		}

	}

	@Component
	public class SecondTest{
		@Value("${deployment.upgradeable}")
		private boolean upgradeable;
		@Value("${deployment.version}")
		private int version;

	}
	@Configuration
	@Data
	@NoArgsConstructor
    @ConfigurationProperties(prefix="upgrade")
	public class configFeed{
		private int version;
		private String type;
		private boolean bc;
		@Autowired
		private SecondTest cfst;

	}
}
