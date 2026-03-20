package com.example.cathotel.repository;

import com.example.cathotel.entity.RoomTypes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomTypesRepository extends MongoRepository<RoomTypes, String> {
}
