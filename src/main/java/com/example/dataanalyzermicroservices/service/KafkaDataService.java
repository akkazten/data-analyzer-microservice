package com.example.dataanalyzermicroservices.service;

import com.example.dataanalyzermicroservices.model.Data;

public interface KafkaDataService {

  void handle(Data data);

}
