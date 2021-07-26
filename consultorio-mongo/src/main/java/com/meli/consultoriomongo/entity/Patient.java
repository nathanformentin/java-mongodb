package com.meli.consultoriomongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    String firstName;
    String lastName;
    Integer age;
    String gender;
}

