package vo;

import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;
import com.example.cathotel.entity.RoomRate;

import java.util.ArrayList;
import java.util.List;

public class RoomPriceVO {
    private List<RoomRate> roomRate = new ArrayList<>();

    private List<RoomCost> roomCosts = new ArrayList<>();

    private List<RoomCostEveryNight> roomCostEveryNights = new ArrayList<>();

    public List<RoomRate> getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(List<RoomRate> roomRate) {
        this.roomRate = roomRate;
    }

    public List<RoomCost> getRoomCosts() {
        return roomCosts;
    }

    public void setRoomCosts(List<RoomCost> roomCosts) {
        this.roomCosts = roomCosts;
    }

    public List<RoomCostEveryNight> getRoomCostEveryNights() {
        return roomCostEveryNights;
    }

    public void setRoomCostEveryNights(List<RoomCostEveryNight> roomCostEveryNights) {
        this.roomCostEveryNights = roomCostEveryNights;
    }
}
