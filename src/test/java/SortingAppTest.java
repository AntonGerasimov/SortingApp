import junit.framework.TestCase;
import org.apache.log4j.*;
import org.apache.log4j.spi.LoggingEvent;
import org.gerasimov.sorting.SortingApp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SortingAppTest extends TestCase {


    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final ByteArrayOutputStream err = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private ByteArrayOutputStream logSink;
    private StreamHandler appLogHandler;
    private static java.util.logging.Logger appLogger;

    private SortingApp sortingApp;

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
    }

    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @BeforeEach
    public void setupLoggerHandler() {
        System.setOut(new PrintStream(out));

        logSink = new ByteArrayOutputStream();
        appLogHandler = new StreamHandler(logSink, new SimpleFormatter());
        appLogger.addHandler(appLogHandler);
    }

    @Test
    @DisplayName("Single Argument Test")
    public void testSingleArgument() throws InvocationTargetException, IllegalAccessException {
        String[] args = {"123"};

        SortingApp.main(args);
        String actual = out.toString()
                .trim();
        String expected = "123";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Ten Arguments Test")
    public void testTenArgument() {
        String[] args = {"123", "12", "94", "95", "38", "75", "66", "54", "27", "99"};
        SortingApp.main(args);
        String actual = out.toString()
                .trim();
        String expected = "12 27 38 54 66 75 94 95 99 123";

        Assert.assertEquals(expected, actual);
    }

}
