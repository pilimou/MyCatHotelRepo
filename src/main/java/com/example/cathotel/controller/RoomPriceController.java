package com.example.cathotel.controller;

import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.service.RoomPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomPriceController {

    @Autowired
    private RoomPriceService roomPriceService;

    @RequestMapping(value = "/queryRoomCost", method = RequestMethod.POST)
    @ResponseBody
    public List<RoomCost> queryRoomCost(){
        return roomPriceService.getAllRoomCosts();
    }

    @RequestMapping(value = "/insertRoomCost", method = RequestMethod.POST)
    @ResponseBody
    public List<RoomCost> insertRoomCost(){

        RoomCost roomCost1 = new RoomCost();
        roomCost1.setCostName("住宿評論折");
        roomCost1.setCostPrice(500);

        RoomCost roomCost2 = new RoomCost();
        roomCost2.setCostName("美容評論折");
        roomCost2.setCostPrice(200);

        RoomCost roomCost3 = new RoomCost();
        roomCost3.setCostName("客人介紹客人可以雙方有折價");
        roomCost3.setCostPrice(500);

        RoomCost roomCost4 = new RoomCost();
        roomCost4.setCostName("台科大教職員工、學生、校友（出示證件）住宿折");
        roomCost4.setCostPrice(500);

        RoomCost roomCost5 = new RoomCost();
        roomCost5.setCostName("使用住宿卷折");
        roomCost5.setCostPrice(200);

        RoomCost roomCost6 = new RoomCost();
        roomCost6.setCostName("群賢里、虎嘯里、全安里出示證件首次住宿折");
        roomCost6.setCostPrice(500);

        List<RoomCost> ListRoomCost = new ArrayList<>();
        ListRoomCost.add(roomCost1);
        ListRoomCost.add(roomCost2);
        ListRoomCost.add(roomCost3);
        ListRoomCost.add(roomCost4);
        ListRoomCost.add(roomCost5);
        ListRoomCost.add(roomCost6);

        roomPriceService.createRoomCost(ListRoomCost);
        return roomPriceService.getAllRoomCosts();
    }
}
