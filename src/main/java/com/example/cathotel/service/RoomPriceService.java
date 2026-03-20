package com.example.cathotel.service;


import com.example.cathotel.entity.RoomCost;
import com.example.cathotel.entity.RoomCostEveryNight;
import com.example.cathotel.entity.RoomDiscountsList;
import com.example.cathotel.entity.RoomTypes;

import java.util.List;
import java.util.Optional;

public interface RoomPriceService {
    //-------------------------------roomTypes--------------------------------

    // --- 新增 (Create) ---
    List<RoomTypes> creatRoomTypes(List<RoomTypes> roomTypes);

    // 查詢全部
    List<RoomTypes> getAllRoomTypes();

    // 修改
    List<RoomTypes> saveRoomTypes(List<RoomTypes> roomTypes);


    //-------------------------------roomDiscountsList--------------------------------

    // --- 新增 (Create) ---
    List<RoomDiscountsList> createRoomDiscountsList(List<RoomDiscountsList> roomDiscountsList);

    // 查詢全部
    List<RoomDiscountsList> getAllRoomDiscountsList();

    // 修改
    List<RoomDiscountsList> saveRoomDiscountsList(List<RoomDiscountsList> patchDataList);

    //-------------------------------RoomCostEveryNight--------------------------------

    // --- 新增 (Create) ---
    List<RoomCostEveryNight> createRoomCostEveryNight(List<RoomCostEveryNight> roomCostsEveryNight);

    // 查詢全部
    List<RoomCostEveryNight> getAllRoomCostEveryNights();

    // 根據 ID 查詢特定資料
    Optional<RoomCostEveryNight> getRoomCostEveryNightById(String id);

    List<RoomCostEveryNight> deleteAllRoomCostEveryNight(List<String> id);


    //----------------------------------------RoomCost-----------------------------------

    // --- 新增 (Create) ---
    List<RoomCost> createRoomCost(List<RoomCost> roomCosts);

    // 查詢全部
    List<RoomCost> getAllRoomCosts();

    // 根據 ID 查詢特定資料
    Optional<RoomCost> getRoomCostById(String id);

    List<RoomCost> deleteAllRoomCost(List<String> id);
}
