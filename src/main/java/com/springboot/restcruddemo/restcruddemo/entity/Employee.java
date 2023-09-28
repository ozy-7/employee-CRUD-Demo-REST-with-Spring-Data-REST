package com.springboot.restcruddemo.restcruddemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Employee {
    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    //define constructors (done by lombok)
    // define getter/setter (done by lombok)
    // define toString (done by lombok)

}
