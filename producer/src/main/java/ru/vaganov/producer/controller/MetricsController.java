package ru.vaganov.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vaganov.producer.model.MetricData;

@RestController
public class MetricsController {
  private final KafkaTemplate<String, MetricData> kafkaTemplate;

  public MetricsController(KafkaTemplate<String, MetricData> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @PostMapping("/metrics")
  public ResponseEntity<?> sendMetrics(@RequestBody MetricData metricData) {
    kafkaTemplate.send("metrics-topic", metricData);
    return ResponseEntity.ok().build();
  }


}
