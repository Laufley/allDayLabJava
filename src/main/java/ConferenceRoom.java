import java.util.ArrayList;

public class ConferenceRoom extends Room{

//    private static final Object collectionOfGuests = new ArrayList<Guest>();
    private String name;

    public ConferenceRoom (String name, int capacity){
        super(capacity);
        this.name = name;

    }

    public String getName() {
        return this.name;
    }
}
