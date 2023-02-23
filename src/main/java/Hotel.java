import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel (){
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedroomList() {
        return bedroomList;
    }

    public Object getBedroom(Object bedroomItem) {
        return bedroomList.indexOf(bedroomItem);
    }

    public ArrayList<ConferenceRoom> getConferenceRoomList() {
        return conferenceRoomList;
    }

    public int checkedInGuestsInBedroomList(){
       return this.bedroomList.size();
    }

    public int checkedInGuestsInConferenceRoomList(){
       return this.conferenceRoomList.size();
    }
    public void addBedroom(Bedroom bedroom){
        this.bedroomList.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRoomList.add(conferenceRoom);
    }

}
