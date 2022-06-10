package com.example.demo.repos;


import com.example.demo.models.BuyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyRepo extends JpaRepository<BuyModel, Long> {
}
