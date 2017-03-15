package homework5.interfaceAPI;

import homework5.Room;

/**
 * Created by user on 15.03.2017.
 */
public class GoogleAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
