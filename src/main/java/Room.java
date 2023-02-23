import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> collectionOfGuests;
    public Room (int capacity){
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getCollectionOfGuests() {
        return collectionOfGuests;
    }

    public void addGuest(Guest name){
        collectionOfGuests.add(name);
    }




}


