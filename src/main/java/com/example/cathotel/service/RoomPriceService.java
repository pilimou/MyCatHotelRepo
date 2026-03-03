package com.example.cathotel.service;


import com.example.cathotel.entity.RoomCost;

import java.util.List;
import java.util.Optional;

public interface RoomPriceService {

    // --- 新增 (Create) ---
    List<RoomCost> createRoomCost(List<RoomCost> roomCosts);

    // 查詢全部
    List<RoomCost> getAllRoomCosts();

    // 根據 ID 查詢特定資料
    Optional<RoomCost> getRoomCostById(String id);

    List<RoomCost> deleteRoomCost(String id);
}
