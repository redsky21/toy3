package com.example.toy3.repository;

import com.example.toy3.entity.QWorkPlan;
import com.example.toy3.entity.WorkPlan;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class WokPlanCustomRepositoryImpl implements WokPlanCustomRepository{
    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<WorkPlan> findInprocessCount(LocalDate baseDate){
        QWorkPlan qWorkPlan = QWorkPlan.workPlan;
        return jpaQueryFactory.selectFrom(qWorkPlan).where(inProcessWhere(baseDate)).fetch();
    }

    public BooleanExpression inProcessWhere(LocalDate baseDate){
        //실제 설계시작일이 오늘 이하인것
        QWorkPlan qWorkPlan = QWorkPlan.workPlan;
        BooleanExpression expr1 = qWorkPlan.actualDesignStartDate.loe(baseDate)
                .and(qWorkPlan.actualDesignEndDate.isNull());
        BooleanExpression expr2 = qWorkPlan.actualDevStartDate.loe(baseDate)
                .and(qWorkPlan.actualDevEndDate.isNull());

        BooleanExpression where = expr1.or(expr2)

                ;
        return where;
    }




}

