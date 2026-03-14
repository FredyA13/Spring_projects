package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Primer version
//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

        //Segunda version
//        Nurse nurse = (Nurse) context.getBean("nurse");
//        nurse.assist();

        //Tercera Version
//        Staff staff = context.getBean(Nurse.class);
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());


    }//main

}//Main
