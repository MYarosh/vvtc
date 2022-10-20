package com.maxyar.vvtc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Calls")
public class Calls {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Who")
    private User who;

    @ManyToOne
    @JoinColumn(name = "Whome")
    private User whome;

    @Column(name = "Time")
    private String time;

    @Column(name = "Duration")
    private String duration;
}
