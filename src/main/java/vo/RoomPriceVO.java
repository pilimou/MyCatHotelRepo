package vo;

import com.example.cathotel.entity.*;

import java.util.ArrayList;
import java.util.List;

public class RoomPriceVO {
    private List<RoomRate> roomRate = new ArrayList<>();

    private List<RoomTypes> roomTypes = new ArrayList<>();

    private List<RoomCost> roomCosts = new ArrayList<>();

    private List<RoomCostEveryNight> roomCostEveryNights = new ArrayList<>();

    private List<RoomDiscountsList> roomDiscountsLists = new ArrayList<>();

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

    public List<RoomDiscountsList> getRoomDiscountsLists() {
        return roomDiscountsLists;
    }

    public void setRoomDiscountsLists(List<RoomDiscountsList> roomDiscountsLists) {
        this.roomDiscountsLists = roomDiscountsLists;
    }

    public List<RoomTypes> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(List<RoomTypes> roomTypes) {
        this.roomTypes = roomTypes;
    }
}
