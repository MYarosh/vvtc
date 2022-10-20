package com.maxyar.vvtc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.graalvm.compiler.lir.LIRInstruction;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Messages")
public class Message {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "From")
    private User from;

    @ManyToOne
    @JoinColumn(name = "To")
    private User to;

    @Column(name = "Text")
    private String text;

    @Column(name = "Time")
    private String time;
}
