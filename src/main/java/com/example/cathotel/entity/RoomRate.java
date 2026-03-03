package com.example.cathotel.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "RoomRate")
public class RoomRate {
    @Id
    private String id;

    @Field("roomName")
    private String roomName;

    @Field("oneNightPrice")
    private Integer oneNightPrice;

    @Field("threeNightPrice")
    private Integer threeNightPrice;

    @Field("sevenNightPrice")
    private Integer sevenNightPrice;

    @Field("fourteenNightPrice")
    private Integer fourteenNightPrice;

    @Field("addCatPrice")
    private Integer addCatPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getOneNightPrice() {
        return oneNightPrice;
    }

    public void setOneNightPrice(Integer oneNightPrice) {
        this.oneNightPrice = oneNightPrice;
    }

    public Integer getThreeNightPrice() {
        return threeNightPrice;
    }

    public void setThreeNightPrice(Integer threeNightPrice) {
        this.threeNightPrice = threeNightPrice;
    }

    public Integer getSevenNightPrice() {
        return sevenNightPrice;
    }

    public void setSevenNightPrice(Integer sevenNightPrice) {
        this.sevenNightPrice = sevenNightPrice;
    }

    public Integer getFourteenNightPrice() {
        return fourteenNightPrice;
    }

    public void setFourteenNightPrice(Integer fourteenNightPrice) {
        this.fourteenNightPrice = fourteenNightPrice;
    }

    public Integer getAddCatPrice() {
        return addCatPrice;
    }

    public void setAddCatPrice(Integer addCatPrice) {
        this.addCatPrice = addCatPrice;
    }
}
