package com.example.toy3.repository;

import com.example.toy3.entity.WorkPlan;

import java.util.List;

public interface WokPlanCustomRepository {
    List<WorkPlan> findInprocessCount();
}
