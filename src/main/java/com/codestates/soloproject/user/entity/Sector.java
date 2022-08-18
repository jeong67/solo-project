package com.codestates.soloproject.user.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SECTOR_TABLE")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sectorId;

    @Column
    private String sector;


}
