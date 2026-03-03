package com.example.cathotel.repository;

import com.example.cathotel.entity.RoomCost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCostRepository extends MongoRepository<RoomCost, String> {
}
