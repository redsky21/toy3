package com.example.toy3.service;

import com.example.toy3.entity.WorkPlan;
import com.example.toy3.model.WorkPlanDTO;
import com.example.toy3.repository.WorkPlanRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkPlanService {
    private final WorkPlanRepository workPlanRepository;
    private final ObjectMapper objectMapper;

    public List<WorkPlanDTO> getWorkPlanDTOList() {
        List<WorkPlanDTO> returnList = workPlanRepository.findAll().stream().map((workPlan -> {
            return objectMapper.convertValue(workPlan, WorkPlanDTO.class);

        })).toList();
        List<WorkPlan> returnList2 = workPlanRepository.findInprocessCount(LocalDate.now());
        return returnList;
    }

}
