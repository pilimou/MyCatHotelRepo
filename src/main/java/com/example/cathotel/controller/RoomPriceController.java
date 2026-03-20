package com.example.cathotel.controller;

import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;
import com.example.cathotel.entity.RoomDiscountsList;
import com.example.cathotel.entity.RoomTypes;
import com.example.cathotel.service.RoomPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        roomPriceVO.setRoomDiscountsLists(roomPriceService.getAllRoomDiscountsList());
        roomPriceVO.setRoomTypes(roomPriceService.getAllRoomTypes());
        return roomPriceVO;
    }

    // 新增每晚折抵
    @RequestMapping(value = "/insertRoomCostEveryNight", method = RequestMethod.POST)
    public List<RoomCostEveryNight> insertRoomCostEveryNight(@RequestBody List<RoomCostEveryNight> roomCostEveryNights){
        return roomPriceService.createRoomCostEveryNight(roomCostEveryNights);
    }

    // 新增每日折抵
    @RequestMapping(value = "/insertRoomCost", method = RequestMethod.POST)
    public List<RoomCost> insertRoomCostE(@RequestBody List<RoomCost> roomCosts){
        return roomPriceService.createRoomCost(roomCosts);
    }


    // 修改房型優惠
    @RequestMapping(value = "/patchDiscountsList", method = RequestMethod.PATCH)
    public List<RoomDiscountsList> patchDiscountsList(@RequestBody List<RoomDiscountsList> pathData){
        return roomPriceService.saveRoomDiscountsList(pathData);
    }

    // 修改房型資料
    @RequestMapping(value = "/patchRoomTypes", method = RequestMethod.PATCH)
    public List<RoomTypes> patchRoomTypes(@RequestBody List<RoomTypes> pathData){
        return roomPriceService.saveRoomTypes(pathData);
    }

    @RequestMapping(value = "/insertRoomPrice", method = RequestMethod.POST)
    public String insertRoomPrice(){

        return "OK";
    }

    // 刪除每晚折抵
    @RequestMapping(value = "/deleteRoomCostEveryNight", method = RequestMethod.DELETE)
    public List<RoomCostEveryNight> deleteRoomCostEveryNight(@RequestBody List<String> id) {
        return roomPriceService.deleteAllRoomCostEveryNight(id);
    }

    // 刪除每日折抵
    @RequestMapping(value = "/deleteRoomCost", method = RequestMethod.DELETE)
    public List<RoomCost> deleteRoomCost(@RequestBody List<String> id){
        return roomPriceService.deleteAllRoomCost(id);
    }


    @RequestMapping(value = "/queryRoomCost", method = RequestMethod.POST)
    @ResponseBody
    public List<RoomCost> queryRoomCost(){
        return roomPriceService.getAllRoomCosts();
    }

}
