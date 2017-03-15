package homework5.interfaceAPI;

import homework5.Room;

/**
 * Created by user on 15.03.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
}
