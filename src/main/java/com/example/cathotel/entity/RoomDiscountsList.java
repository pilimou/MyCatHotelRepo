package com.example.cathotel.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "RoomDiscountsList")
public class RoomDiscountsList {
    @Id
    private String id;

    @Field("startDate")
    private String startDate;

    @Field("endDate")
    private String endDate;

    @Field("threeNight")
    private Integer threeNight;

    @Field("sevenNight")
    private Integer sevenNight;

    @Field("fourteenNight")
    private Integer fourteenNight;

    @Field("twentyOneNight")
    private Integer twentyOneNight;

    @Field("thirtyNight")
    private Integer thirtyNight;

    @Field("extraCatFee")
    private Integer extraCatFee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getThreeNight() {
        return threeNight;
    }

    public void setThreeNight(Integer threeNight) {
        this.threeNight = threeNight;
    }

    public Integer getSevenNight() {
        return sevenNight;
    }

    public void setSevenNight(Integer sevenNight) {
        this.sevenNight = sevenNight;
    }

    public Integer getFourteenNight() {
        return fourteenNight;
    }

    public void setFourteenNight(Integer fourteenNight) {
        this.fourteenNight = fourteenNight;
    }

    public Integer getTwentyOneNight() {
        return twentyOneNight;
    }

    public void setTwentyOneNight(Integer twentyOneNight) {
        this.twentyOneNight = twentyOneNight;
    }

    public Integer getThirtyNight() {
        return thirtyNight;
    }

    public void setThirtyNight(Integer thirtyNight) {
        this.thirtyNight = thirtyNight;
    }

    public Integer getExtraCatFee() {
        return extraCatFee;
    }

    public void setExtraCatFee(Integer extraCatFee) {
        this.extraCatFee = extraCatFee;
    }
}
