package Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SomeClass {
    private static Logger logger = Logger.getLogger(SomeClass.class.getName());

    public void someMethod(){
        logger.info("some message");
    }

    public void testExceptionLogging(){
        try {
            int i = 30 / 0;
        }catch (ArithmeticException e){
            logger.log(Level.SEVERE,"You division by zero", e);
        }

    }
}
