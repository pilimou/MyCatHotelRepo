package com.example.cathotel.service.impl;

import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;
import com.example.cathotel.entity.RoomDiscountsList;
import com.example.cathotel.entity.RoomTypes;
import com.example.cathotel.repository.*;
import com.example.cathotel.service.RoomPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomPriceServiceImpl implements RoomPriceService {

    @Autowired
    private RoomRateRepository roomRateRepository;

    @Autowired
    private RoomCostRepository roomCostRepository;

    @Autowired
    private RoomCostEveryNightRepository roomCostEveryNightRepository;

    @Autowired
    private RoomDiscountsListRepository roomDiscountsListRepository;

    @Autowired
    private RoomTypesRepository roomTypesRepository;

    //-------------------------------roomTypes--------------------------------

    @Override
    public List<RoomTypes> creatRoomTypes(List<RoomTypes> roomTypes) {
        return roomTypesRepository.saveAll(roomTypes);
    }

    @Override
    public List<RoomTypes> getAllRoomTypes() {
        return roomTypesRepository.findAll();
    }

    @Override
    public List<RoomTypes> saveRoomTypes(List<RoomTypes> roomTypes) {
        return roomTypesRepository.saveAll(roomTypes);
    }

    //-------------------------------roomDiscountsList--------------------------------

    @Override
    public List<RoomDiscountsList> createRoomDiscountsList(List<RoomDiscountsList> roomDiscountsList) {
        return roomDiscountsListRepository.saveAll(roomDiscountsList);
    }

    @Override
    public List<RoomDiscountsList> getAllRoomDiscountsList() {
        return roomDiscountsListRepository.findAll();
    }

    @Override
    public List<RoomDiscountsList> saveRoomDiscountsList(List<RoomDiscountsList> patchDataList) {
        return roomDiscountsListRepository.saveAll(patchDataList);
    }

    //-------------------------------RoomCostEveryNight--------------------------------



    // --- 新增/修改多筆 (Create) ---
    @Override
    public List<RoomCostEveryNight> createRoomCostEveryNight(List<RoomCostEveryNight> roomCostsEveryNight) {
        List<RoomCostEveryNight> roomCostEveryNights = roomCostEveryNightRepository.saveAll(roomCostsEveryNight);
        return getAllRoomCostEveryNights();
    }
    // 查詢全部
    @Override
    public List<RoomCostEveryNight> getAllRoomCostEveryNights() {
        return roomCostEveryNightRepository.findAll();
    }

    // 根據 ID 查詢特定資料
    @Override
    public Optional<RoomCostEveryNight> getRoomCostEveryNightById(String id) {
        return roomCostEveryNightRepository.findById(id);
    }

    //刪除
    @Override
    public List<RoomCostEveryNight> deleteAllRoomCostEveryNight(List<String> id) {
        roomCostEveryNightRepository.deleteAllById(id);
        return getAllRoomCostEveryNights();
    }

    //----------------------------------------RoomCost-----------------------------------

    // --- 新增多筆 (Create) ---
    @Override
    public List<RoomCost> createRoomCost(List<RoomCost> roomCost) {
        // save 方法會回傳儲存後的物件（包含生成的 ID）
        roomCostRepository.saveAll(roomCost);
        return getAllRoomCosts();
    }

    // 查詢全部
    @Override
    public List<RoomCost> getAllRoomCosts() {
        return roomCostRepository.findAll();
    }

    // 根據 ID 查詢特定資料
    @Override
    public Optional<RoomCost> getRoomCostById(String id) {
        return roomCostRepository.findById(id);
    }

    //刪除
    @Override
    public List<RoomCost> deleteAllRoomCost(List<String> id) {
        roomCostRepository.deleteAllById(id);
        return getAllRoomCosts();
    }


}
