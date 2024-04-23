package ru.vaganov.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vaganov.consumer.model.MetricData;

public interface ConsumerRepository extends JpaRepository<MetricData, Long> {
}
