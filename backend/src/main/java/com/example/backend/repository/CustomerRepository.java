package com.example.backend.repository;

import com.example.backend.model.entity.Customer;
import com.example.backend.model.entity.Emploeey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    UserDetails findByUsername(String username);
}
