package com.example.toy3.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
//@ToString(of={"teamId","teamName"})
public class WorkPlan {

    @Id
    @GeneratedValue
    private Long rowNum;
    private String level1;
    private String level2;
    private String level3;
    private String level4;
    private String processName;
    private String processDesc;
    private String devType;
    private String processType;
    private String functionType;
    private String difficulty;
    private String newOld;
    private Double reuseRate;
    private Double stdEffort;
    private Double reuseEffort;
    private Double etcEffort;
    private Double effort;
    private Double designEffort;
    private Double developEffort;
    private Double guideEffort;
    private String designMonth;
    private String developMonth;
    private String guideMonth;
    private String effortDetail;
    private String remark;
    private Double changeEffort;
    private String designer;
    private String developer;
    private String guideWriter;
    private LocalDate designFromDate;
    private LocalDate designToDate;
    private LocalDate devFromDate;
    private LocalDate devToDate;
    private LocalDate guideWriteFromDate;
    private LocalDate guideWriteToDate;
    private LocalDate actualDesignStartDate;
    private LocalDate actualDesignEndDate;
    private String designDocName;
    private LocalDate actualDevStartDate;
    private LocalDate actualDevEndDate;
    private String programName;
    private LocalDate guideDocStartDate;
    private LocalDate guideDocEndDate;
    private String guideDocName;


}
