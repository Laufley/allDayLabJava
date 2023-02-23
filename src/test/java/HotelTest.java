import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    @Before
    public void before(){

        guest1 = new Guest("Paul");
        guest2 = new Guest("Brian");

        ArrayList<Bedroom> listOfBedrooms = new ArrayList<>();
        bedroom1 = new Bedroom(2, 89, RoomType.SINGLE);
        listOfBedrooms.add( bedroom1);
        bedroom2 = new Bedroom(4, 70, RoomType.DOUBLE);
        listOfBedrooms.add( bedroom2);

        ArrayList<ConferenceRoom> listOfConferenceRooms = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom("Arts Room", 10);
        listOfConferenceRooms.add(conferenceRoom1);
        conferenceRoom2 = new ConferenceRoom("Blue Room", 50);
        listOfConferenceRooms.add(conferenceRoom2);
    }

    @Test
    public void hotelCanAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(bedroom1, hotel.getBedroom(bedroom1));
    }
}

