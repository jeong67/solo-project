package com.codestates.soloproject.user.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "REGION_TABLE")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long regionId;

    @Column
    private String region;
}
