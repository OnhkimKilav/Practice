package Logging;


import java.util.logging.Level;
import java.util.logging.Logger;

public class SomeClass {
    private static Logger logger = Logger.getLogger(SomeClass.class.getName());

    public void someMethod(){
        logger.info("some message");
    }

    public void testExceptionLogging() throws Exception {
        try {
            int i = 30 / 0;
        }catch (ArithmeticException e){
            logger.log(Level.INFO,"You division by zero", e);
        }
        logger.log(Level.INFO,"You division by zero");
        throw new Exception("Exception");
        //System.out.println("Test");

    }

    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        someClass.testExceptionLogging();

        //System.out.println(System.getProperty("java.util.logging.config.file"));

        //-Djava.util.logging.config.file=D:\Programs\YandexDisk\Practice1\src\main\java\Logging\log.properties
        //LogManager.getLogManager().readConfiguration();

//        Handler consoleHandler = new ConsoleHandler();
//        //Handler fileHandler = new FileHandler();
//        logger.addHandler(consoleHandler);
//        //someClass.testExceptionLogging();
//
//        consoleHandler.setFilter(new MyFilter());
//        consoleHandler.setFormatter(new MyFormatter());
//        logger.info("exception");
//        logger.info("exception max");

        /*new StreamHandler();
        new SocketHandler();*/
    }

    /*static class MyFilter implements Filter{

        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("max");
        }
    }

    static class MyFormatter extends Formatter{
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + record.getMessage();
        }
    }*/
}