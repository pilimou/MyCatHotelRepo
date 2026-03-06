package com.example.cathotel.service.impl;

import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;
import com.example.cathotel.repository.RoomCostEveryNightRepository;
import com.example.cathotel.repository.RoomCostRepository;
import com.example.cathotel.repository.RoomRateRepository;
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

    //-------------------------------RoomCostEveryNight--------------------------------

    // --- 新增多筆 (Create) ---
    @Override
    public List<RoomCostEveryNight> createRoomCostEveryNight(List<RoomCostEveryNight> roomCostsEveryNight) {
        return roomCostEveryNightRepository.saveAll(roomCostsEveryNight);
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
    public List<RoomCostEveryNight> deleteRoomCostEveryNight(String id) {
        roomCostEveryNightRepository.deleteById(id);
        return roomCostEveryNightRepository.findAll();
    }

    //----------------------------------------RoomCost-----------------------------------

    // --- 新增多筆 (Create) ---
    @Override
    public List<RoomCost> createRoomCost(List<RoomCost> roomCost) {
        // save 方法會回傳儲存後的物件（包含生成的 ID）
        return roomCostRepository.saveAll(roomCost);
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
    public List<RoomCost> deleteRoomCost(String id) {
        roomCostRepository.deleteById(id);
        return roomCostRepository.findAll();
    }


}
