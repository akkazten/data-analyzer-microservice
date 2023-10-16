package com.example.dataanalyzermicroservices.service;

import com.example.dataanalyzermicroservices.model.Data;
import com.example.dataanalyzermicroservices.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaDataServiceImpl implements KafkaDataService {

  private final DataRepository dataRepository;

  @Override
  public void handle(Data data) {
    log.info("Data object {} was saved: ", data);
    dataRepository.save(data);
  }
}
