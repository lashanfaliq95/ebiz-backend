package com.shaanxd.cardapp.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Email(message = "Please enter a valid email address.")
    @NotBlank(message = "Email cannot be empty.")
    private String email;

    @NotBlank(message = "Name cannot be empty.")
    private String name;

    @NotBlank(message = "Company name cannot be empty.")
    private String companyName;

    @NotBlank(message = "Number cannot be empty.")
    private String number;

    @NotBlank(message = "City cannot be empty.")
    private String city;

    @NotBlank(message = "Address cannot be empty.")
    private String address;

    @NotBlank(message = "Services cannot be empty")
    private String services;

    private String phoneNumber;

    private String whatsAppNumber;

    private String googleLocation;

    private String facebookLink;

    private String instagramLink;

    private String companyWebsite;

    private String image;

}
