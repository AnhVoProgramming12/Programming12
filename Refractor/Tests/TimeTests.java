import Tools.Time.Hour;
import Tools.Time.Minute;
import Tools.Time.Time;
import Tools.Time.Second;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeTests {
    Time time;
    Hour hr;
    Minute min;
    Second sec;

    @Before
    public void setup(){
        time = new Time();
        hr = new Hour(10);
        sec = new Second(59);
        min = new Minute(59);

    }

    @Test
    public void testTick(){
        time.tick();
        assertEquals(1,time.getSec().getSec());
        Time time2 = new Time(hr,min,sec);
        time2.tick();
        assertEquals(11,time2.getHr().getHour());
        assertEquals(0,time2.getMin().getMin());
        assertEquals(0,time2.getSec().getSec());
    }

    @Test
    public void testToString(){
        Time time2 = new Time(hr,min,sec);
        assertEquals(hr.toString()+":"+min.toString()+":"+sec.toString(),time2.toString());
    }

}
