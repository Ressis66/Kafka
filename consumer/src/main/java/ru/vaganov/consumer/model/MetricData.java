package ru.vaganov.consumer.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MetricData {
  @GeneratedValue
  @Id
  private Long id;
  private long timestamp;
  private String appName;
  private double cpuUsage;
}


