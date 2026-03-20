package com.example.cathotel.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "RoomTypes")
public class RoomTypes {

    @Id
    private String id;

    @Field("roomName")
    private String roomName;

    @Field("roomPrice")
    private Integer roomPrice;

    @Field("totalRoomCount")
    private Integer totalRoomCount;

    @Field("catLimit")
    private Integer catLimit;

    @Field("freeCatQuota")
    private Integer freeCatQuota;

    @Field("roomNote")
    private String roomNote;

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

    public Integer getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Integer roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Integer getTotalRoomCount() {
        return totalRoomCount;
    }

    public void setTotalRoomCount(Integer totalRoomCount) {
        this.totalRoomCount = totalRoomCount;
    }

    public Integer getCatLimit() {
        return catLimit;
    }

    public void setCatLimit(Integer catLimit) {
        this.catLimit = catLimit;
    }

    public Integer getFreeCatQuota() {
        return freeCatQuota;
    }

    public void setFreeCatQuota(Integer freeCatQuota) {
        this.freeCatQuota = freeCatQuota;
    }

    public String getRoomNote() {
        return roomNote;
    }

    public void setRoomNote(String roomNote) {
        this.roomNote = roomNote;
    }
}
