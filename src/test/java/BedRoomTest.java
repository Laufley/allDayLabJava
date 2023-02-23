import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    Bedroom bedroom;
    @Before
    public void before(){
        bedroom = new Bedroom(2, 17, RoomType.DOUBLE);
    }
    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void roomHasRoomNumber(){
        assertEquals(17, bedroom.getRoomNumber());
    }
    @Test
    public void roomHasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }
}
