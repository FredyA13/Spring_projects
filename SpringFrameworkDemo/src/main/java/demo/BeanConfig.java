package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Esta es otra manera de crear componentes para los beans
//En esta clase hacemos lo mismo que en el spring.xml, escaneamos la carpeta "demo" para encontrar los componentes
//En el xml se vio que podemos crear los components de manera individual sin hacer un scan, en esta clase podemos hacer lo mismo
@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

//    @Bean //Con esta anotacion digo que quiero un Bean de tipo Doctor, en este caso tendríamos que quitar la anotación @Component de la clase Doctor
//    public Doctor doctor(){
//        return new Doctor(null);
//    }

}
