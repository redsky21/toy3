package com.example.toy3.controller;


import com.example.toy3.model.CountDTO;
import com.example.toy3.model.WorkPlanDTO;
import com.example.toy3.service.WorkPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("home")
public class HomeController {
    private final WorkPlanService workPlanService;

    @GetMapping("count/{baseDate}")
    public List<CountDTO> getWorkPlanList(@PathVariable("baseDate") LocalDate baseDate) {
//        List<WorkPlanDTO> workPlanDTOList = new ArrayList<>();

        return new ArrayList<>();
    }
}
