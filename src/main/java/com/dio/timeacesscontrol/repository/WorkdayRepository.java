package com.dio.timeacesscontrol.repository;

import com.dio.timeacesscontrol.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkdayRepository extends JpaRepository<Workday,Long> {
}
