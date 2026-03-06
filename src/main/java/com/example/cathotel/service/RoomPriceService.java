package com.example.cathotel.service;


import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;

import java.util.List;
import java.util.Optional;

public interface RoomPriceService {





    //-------------------------------RoomCostEveryNight--------------------------------

    // --- 新增 (Create) ---
    List<RoomCostEveryNight> createRoomCostEveryNight(List<RoomCostEveryNight> roomCostsEveryNight);

    // 查詢全部
    List<RoomCostEveryNight> getAllRoomCostEveryNights();

    // 根據 ID 查詢特定資料
    Optional<RoomCostEveryNight> getRoomCostEveryNightById(String id);

    List<RoomCostEveryNight> deleteRoomCostEveryNight(String id);


    //----------------------------------------RoomCost-----------------------------------

    // --- 新增 (Create) ---
    List<RoomCost> createRoomCost(List<RoomCost> roomCosts);

    // 查詢全部
    List<RoomCost> getAllRoomCosts();

    // 根據 ID 查詢特定資料
    Optional<RoomCost> getRoomCostById(String id);

    List<RoomCost> deleteRoomCost(String id);
}
