package ru.sbt.bit.ood.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Devjiu on 27.11.2016.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        //TradesJob tradesJob = (TradesJob) context.getBean("job");
    }
}
