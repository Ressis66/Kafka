package ru.vaganov.producer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetricData {
  private Long id;
  private long timestamp;
  private String appName;
  private double cpuUsage;
}
