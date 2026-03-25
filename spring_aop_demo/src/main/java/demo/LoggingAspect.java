package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect //Con esta anotación le decimos a Spring que esto será un aspect, una lógica transversal
@Component // Recordar que Spring necesita saber que esto es un componente, si no, no ejecutará nada
public class LoggingAspect {

    //Con la anotación Before le decimos a Spring que esto es un "advice", en este caso "antes del méthod" a llamar
    //execution es un "Pointcut", donde aplicar el method, en este caso en el method checkout de la clase ShoppingCart
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        //System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: " + arg);

    }//logger

    //Con los dos puntos le decimos a Spring que agarra todos los parámetros que el méthod necesitas
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers!");
    }


    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: " + retVal);
    }
}
