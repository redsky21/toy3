package com.example.toy3.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(of={"teamId","teamName"})
public class Team {
    @Id
    @GeneratedValue
    private Long teamId;

    private String teamName;

}
