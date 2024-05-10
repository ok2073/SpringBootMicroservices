package com.keelient.departmentservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    /*
    * GenerationType.IDENTITY, the JPA provider interacts with the underlying database
    * and utilizes its mechanism for generating unique identifiers. Most databases achieve
    * this through auto-increment columns.
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
