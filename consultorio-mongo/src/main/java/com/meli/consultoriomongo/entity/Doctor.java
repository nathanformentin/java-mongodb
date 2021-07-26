package com.meli.consultoriomongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    String dni;
    String firstName;
    String lastName;
    String specialty;
}
