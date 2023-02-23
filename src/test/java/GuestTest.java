import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Indira");
    }

    @Test
    public void guestCanHaveName(){
        assertEquals("Indira", guest.getName());
    }
    @Test
    public void canSetName() {
        guest.setName("Maggie");
        assertEquals("Maggie", guest.getName());
    }
}
