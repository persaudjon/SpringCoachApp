package com.learnSpring.coachDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoachApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.print(theCoach.getDailyWorkout());;

        //close app
        context.close();
    }
}
