package com.example.cathotel.controller;

import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;
import com.example.cathotel.service.RoomPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vo.RoomPriceVO;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomPriceController {

    @Autowired
    private RoomPriceService roomPriceService;

    @RequestMapping(value = "/queryRoomPrice", method = RequestMethod.POST)
    @ResponseBody
    public RoomPriceVO queryRoomPrice(){
        RoomPriceVO roomPriceVO = new RoomPriceVO();
        roomPriceVO.setRoomCosts(roomPriceService.getAllRoomCosts());
        roomPriceVO.setRoomCostEveryNights(roomPriceService.getAllRoomCostEveryNights());
        return roomPriceVO;
    }

    @RequestMapping(value = "/insertRoomPrice", method = RequestMethod.POST)
    public String insertRoomPrice(){

        return "OK";
    }



    @RequestMapping(value = "/queryRoomCost", method = RequestMethod.POST)
    @ResponseBody
    public List<RoomCost> queryRoomCost(){
        return roomPriceService.getAllRoomCosts();
    }

    @RequestMapping(value = "/insertRoomCost", method = RequestMethod.POST)
    @ResponseBody
    public List<RoomCost> insertRoomCost(){

        return roomPriceService.getAllRoomCosts();
    }
}
