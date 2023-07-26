//import junit.framework.TestCase;
//import org.apache.log4j.Logger;
//import org.gerasimov.sorting.SortingApp;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.logging.Level;
//import java.util.logging.LogManager;
//import java.util.logging.SimpleFormatter;
//import java.util.logging.StreamHandler;
//
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class Backup {
//
//    import junit.framework.TestCase;
//import org.apache.log4j.Logger;
//import org.apache.log4j.spi.LoggingEvent;
//import org.gerasimov.sorting.SortingApp;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//
//import java.io.*;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.jar.JarInputStream;
//import java.util.jar.Manifest;
//import java.util.logging.Level;
//import java.util.logging.LogManager;
//import java.util.logging.SimpleFormatter;
//import java.util.logging.StreamHandler;
//
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//    public class SortingAppTest extends TestCase {
//
////    private final PrintStream standardOut = System.out;
////    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//
//        private static java.util.logging.Logger appLogger;
//
//        private ByteArrayOutputStream logSink;
//        private StreamHandler appLogHandler;
//        private static Method mainMethod;
//
//        @BeforeAll
//        static void setup() throws IOException, ClassNotFoundException, NoSuchMethodException {
//            SortingApp sortingAppDemo = new SortingApp();
//            Class sortingAppClass = sortingAppDemo.getClass();
//            mainMethod = sortingAppClass.getMethod("main", String[].class);
//
//            appLogger = LogManager.getLogManager().getLogger("");
//            appLogger.setLevel(Level.ALL);
//
//
//        }
//
//        @BeforeEach
//        public void setupLoggerHandler() {
////        System.setOut(new PrintStream(outputStreamCaptor));
//
//            logSink = new ByteArrayOutputStream();
//            appLogHandler = new StreamHandler(logSink, new SimpleFormatter());
//            appLogger.addHandler(appLogHandler);
//        }
//
//        @Test
//        @DisplayName("Zero Argument Test")
//        public void testZeroArgument() throws InvocationTargetException, IllegalAccessException {
//            TestAppender testAppender = new TestAppender();
//
//            Logger.getRootLogger().addAppender(testAppender);
//
//            String[] args = {};
//
//            final String output = runApp(args);
//            //SortingApp.main(args);
//
//            assertThat(output, containsString("SEVERE: No such file: src/test/resources/sandbox/cases/no-such-file.txt"));
//
//
////        LoggingEvent loggingEvent = testAppender.events.get(0);
////        String output = outputStreamCaptor.toString()
////                .trim();
//            //String expected = "Error: arguments are missing";
//
//            //assertThat(output, containsString("SEVERE: arguments are missing"));
//
//            //assertEquals("arguments are missing", Level.SEVERE, loggingEvent.getLevel());
//
//
//
//            //Assert.assertEquals(expected, actual);
//        }
//
//        @Test
//        @DisplayName("Single Argument Test")
//        public void testSingleArgument() throws InvocationTargetException, IllegalAccessException {
//            String[] args = {"123"};
//
//            String output = runApp(args);
//            //SortingApp.main(args);
//            //String actual = outputStreamCaptor.toString()
//            //.trim();
//            String expected = "123";
//
//            Assert.assertEquals(expected, output);
//        }
////
////    @Test
////    @DisplayName("Ten Arguments Test")
////    public void testTenArgument() {
////        String[] args = {"123", "12", "94", "95", "38", "75", "66", "54", "27", "99"};
////        SortingApp.main(args);
////        String actual = outputStreamCaptor.toString()
////                .trim();
////        String expected = "12 27 38 54 66 75 94 95 99 123";
////
////        Assert.assertEquals(expected, actual);
////    }
////
////    @Test
////    @DisplayName("Too Much Arguments Test")
////    public void testTooMuchArguments() {
////        String[] args = {"123", "321", "12", "21", "32", "49", "94", "83", "58", "75", "66"};
////        SortingApp.main(args);
////        String actual = outputStreamCaptor.toString()
////                .trim();
////        String expected = "Error: too much arguments. Try to enter less then 11 arguments";
////
////        Assert.assertEquals(expected, actual);
////    }
//
//        private String runApp(final String[] args) throws IllegalAccessException, InvocationTargetException {
//            mainMethod.invoke(null, (Object) args);
////        SortingApp.main(args);
////        appLogHandler.flush();
//            return logSink.toString();
//        }
//
//
////    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
////    private final ByteArrayOutputStream err = new ByteArrayOutputStream();
////    private final PrintStream originalOut = System.out;
////    private final PrintStream originalErr = System.err;
////
////    private SortingApp sortingApp;
////
////    @Before
////    public void setStreams() {
////        System.setOut(new PrintStream(out));
////        System.setErr(new PrintStream(err));
////    }
////
////    @After
////    public void restoreInitialStreams() {
////        System.setOut(originalOut);
////        System.setErr(originalErr);
////    }
//
////    @Test
////    @DisplayName("Testaqwfqwfdsva")
////    public void test1(){
////        String[] args = {"123"};
//////        SortingApp.main(args);
////        SortingApp.printHello();
////        String actual = out.toString();
////        String expected = "123";
////        assertEquals(expected, actual);
////
////    }
////
////    @Test
////    public void test2(){
////        System.out.println("HELLO");
////        String actual = out.toString();
////        StringBuilder stringBuilder = new StringBuilder();
////        stringBuilder.append("HELLO");
////        String expected = stringBuilder.toString();
////        assertEquals(expected, actual);
////    }
//
//
////    @ParameterizedTest
////    public void singleNumberCaseTest(){
////        String[] args = {"123"};
////        int[] received = SortingApp.main(args);
////    }
//
////    @Test
////    void my_test(){
//////        String userInput = String.format("Dan%sVega%sdanvega@gmail.com",
//////                System.lineSeparator(),
//////                System.lineSeparator());
//////        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
//////        System.setIn(bais);
////
//////        String expected = "123";
//////        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//////        PrintStream printStream = new PrintStream(baos);
//////        System.setOut(printStream);
//////
//////
////        String[] args = new String[] {"123"};
////        SortingApp.main(args); // call the main method
////        //SortingApp.myPrint(args);
//////
//////        String[] lines = baos.toString().split(System.lineSeparator());
//////        String actual = lines[lines.length-1];
////
////        // checkout output
////        //Assert.assertEquals(expected,actual);
////        assertEquals("123", out.toString());
////        //assertEquals(expected, actual);
////    }
//
//    }
//
//}
