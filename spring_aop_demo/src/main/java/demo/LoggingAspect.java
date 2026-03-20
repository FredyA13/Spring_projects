package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect //Con esta anotación le decimos a Spring que esto será un aspect, una lógica transversal
@Component // Recordar que Spring necesita saber que esto es un componente, si no, no ejecutará nada
public class LoggingAspect {

    //Con la anotación Before le decimos a Spring que esto es un "advice", en este caso "antes del méthod" a llamar
    //execution es un "Pointcut", donde aplicar el method, en este caso en el method checkout de la clase ShoppingCart
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("Before Loggers!");
    }//logger

    //Con los dos puntos le decimos a Spring que agarra todos los parámetros que el méthod necesitas
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers!");
    }
}
