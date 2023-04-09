package com.example.toy3.repository;

import com.example.toy3.entity.WorkPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkPlanRepository extends JpaRepository<WorkPlan,Long>,WokPlanCustomRepository  {
}
