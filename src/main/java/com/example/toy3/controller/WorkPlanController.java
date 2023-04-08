package com.example.toy3.controller;


import com.example.toy3.model.WorkPlanDTO;
import com.example.toy3.service.WorkPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class WorkPlanController {
    private final WorkPlanService workPlanService;

    @GetMapping("workplan")
    public List<WorkPlanDTO> getWorkPlanList() {
//        List<WorkPlanDTO> workPlanDTOList = new ArrayList<>();
        List<WorkPlanDTO> workPlanDTOList = workPlanService.getWorkPlanDTOList();
        return workPlanDTOList;
    }
}
