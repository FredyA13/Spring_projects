package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Con esta linea llamamos al archivo xml que tiene la configuracion de nuestros componentes
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Con esta linea hacemos lo mismo que en el xml pero ahora con un archivo de clase
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        //Primer version
//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

        //Segunda version
//        Nurse nurse = (Nurse) context.getBean("nurse");
//        nurse.assist();

        //Tercera Version
//        Staff staff = context.getBean(Nurse.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("BMMS");
        System.out.println(doctor);
//
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);


    }//main

}//Main
