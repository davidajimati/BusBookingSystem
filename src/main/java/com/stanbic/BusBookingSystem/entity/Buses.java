package com.stanbic.BusBookingSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(schema = "BUS_LIST")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Buses {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BUS_LIST_INDEX_GENERATOR", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String busName;

    @Column(nullable = true)
    private String travelRoute;

    @Column(nullable = false)
    private String PlateNumber;

    @Column(nullable = false)
    private int seatingCapacity;

    @Column(nullable = true)
    private Date timeAvailable;

    @Column(nullable = true)
    private String driverName;

    @Column(nullable = true)
    private String driverContact;

    @Column(nullable = true)
    private String marshalName;

    @Column(nullable = true)
    private String marshalContact;

    @Column(nullable = true)
    private String marshallEmail;
}
