package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.demo.ConfigurationApp;
import com.example.demo.House;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		MyRunable myRunable = new MyRunable();
		Thread thread1= new Thread(myRunable);
		Thread thread2= new Thread(myRunable);
		Thread thread3= new Thread(myRunable);
		thread3.setName("ur3");

		thread1.start();
		System.out.println(thread1.getName());
		thread2.start();
		System.out.println(thread2.getName());
		thread3.start();
		System.out.println(thread3.getName());

		/*AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationApp.class);
		House house= context.getBean(House.class);
		house.buildwall();
		house.view();

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
System.out.printf("floors: %d\n",house.getHeight());

		context.close();
		SpringApplication.run(DemoApplication.class, args);

		PersonBean person= context.getBean(PersonBean.class);
		System.out.printf("%s-%d\n", person.getName(),person.getAge());
		context.close();*/
	}



}
