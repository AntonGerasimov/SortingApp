import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

import java.util.ArrayList;
import java.util.List;

public class TestAppender extends AppenderSkeleton{
    public List<LoggingEvent> events = new ArrayList<LoggingEvent>();
    public void close() {}
    public boolean requiresLayout() {return false;}
    @Override
    protected void append(LoggingEvent event) {
        events.add(event);
    }
}