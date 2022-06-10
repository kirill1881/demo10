package com.example.demo.repos;

import com.example.demo.models.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<DataModel, Long> {
}
