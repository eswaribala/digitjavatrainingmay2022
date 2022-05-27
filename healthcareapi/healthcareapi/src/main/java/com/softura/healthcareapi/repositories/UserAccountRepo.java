package com.softura.healthcareapi.repositories;

import com.softura.healthcareapi.models.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepo extends JpaRepository<UserAccount,String> {
}
