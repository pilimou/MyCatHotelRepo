package com.example.cathotel.repository;

import com.example.cathotel.entity.RoomCostEveryNight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCostEveryNightRepository extends MongoRepository<RoomCostEveryNight, String> {
}
