package com.example.cathotel.repository;

import com.example.cathotel.entity.RoomDiscountsList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDiscountsListRepository extends MongoRepository<RoomDiscountsList, String> {
}
