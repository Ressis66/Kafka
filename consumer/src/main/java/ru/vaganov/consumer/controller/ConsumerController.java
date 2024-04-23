package ru.vaganov.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.vaganov.consumer.model.MetricData;
import ru.vaganov.consumer.repository.ConsumerRepository;

import java.util.Arrays;
import java.util.List;

@RestController
public class ConsumerController {

  @Autowired
  private ConsumerRepository repository;

  @GetMapping("/metrics")
  public List<MetricData> getAllMetrics() {

    return repository.findAll();
  }

  @GetMapping("/metrics/{id}")
  public MetricData getMetricById(@PathVariable String id) {
    Long id1 =Long.parseLong(id);
    return repository.findById(id1).get();
  }
}
