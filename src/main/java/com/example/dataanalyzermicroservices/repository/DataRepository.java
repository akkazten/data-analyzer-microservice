package com.example.dataanalyzermicroservices.repository;

import com.example.dataanalyzermicroservices.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {

}
