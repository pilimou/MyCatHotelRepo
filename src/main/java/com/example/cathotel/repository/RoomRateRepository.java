package com.example.cathotel.repository;

import com.example.cathotel.entity.RoomRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRateRepository extends MongoRepository<RoomRate, String> {
}
