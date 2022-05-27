package com.softura.donorapi.repositories;


import com.softura.donorapi.models.Donor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DonorRepo extends MongoRepository<Donor,String> {
}
