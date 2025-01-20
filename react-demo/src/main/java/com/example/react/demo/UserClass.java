package com.example.react.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class UserClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name") // Matches database naming conventions
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth; // Changed to LocalDate for better date handling

    @Column(name = "id_number", unique = true) // Unique constraint for ID numbers
    private Long idNumber;

    @Column(name = "username", unique = true) // Unique constraint for usernames
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email_address", unique = true) // Unique constraint for emails
    private String email;

    @Column(name = "card_number", unique = true)
    private Long cardNumber;


}
