package homework5.interfaceAPI;

import homework5.Room;

/**
 * Created by user on 15.03.2017.
 */
public class TripAdvisorAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
