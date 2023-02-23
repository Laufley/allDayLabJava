public enum RoomType {

    SINGLE(2),
    DOUBLE(4);


    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }


}