package com.meli.consultoriomongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turn {

    String id;
    Patient patient;
    Doctor doctor;
    LocalDate date;
    String status;
}
