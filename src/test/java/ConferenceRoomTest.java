import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Meeting room", 20 );
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Meeting room", conferenceRoom.getName());
    }

    @Test
    public void setConferenceRoomHasCapacity(){
        assertEquals(20,conferenceRoom.getCapacity());
    }



}
