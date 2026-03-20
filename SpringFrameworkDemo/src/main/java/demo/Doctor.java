package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component //Con esta anotacion le digo a SpringCore que quiero crear un componente para los beans de esta clase, usando el xml
@Scope(scopeName = "prototype") //Con esta anotación decimos que el scope de este componente será de tipo prototype
public class Doctor implements Staff, BeanNameAware {

      private String qualification;
//    private Nurse nurse;


    public Doctor() {
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }//assist

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is called!");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct Method is called!");
    }

    //    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }

}//Doctor
