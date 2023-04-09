package com.example.toy3.repository;

import com.example.toy3.entity.QWorkPlan;
import com.example.toy3.entity.WorkPlan;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class WokPlanCustomRepositoryImpl implements WokPlanCustomRepository{
    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<WorkPlan> findInprocessCount(){
        QWorkPlan qWorkPlan = QWorkPlan.workPlan;
        return jpaQueryFactory.selectFrom(qWorkPlan).fetch();
    }
}

