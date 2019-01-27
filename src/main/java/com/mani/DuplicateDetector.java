package com.mani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DuplicateDetector {
    String path;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    static Test test;

    public DuplicateDetector(String path){
        this.path=path;
    }

    public static void main(String[] args) throws Exception{

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-config.old"});

        try {
            Test test= (Test) context.getBean("test");
            test.test();
        }catch (Exception exp){
            exp.printStackTrace();
            System.out.println(exp.getMessage());
        }



//        CustomerService cust = (CustomerService)context.getBean("customerService");
//        System.out.println(cust);
    }
}
