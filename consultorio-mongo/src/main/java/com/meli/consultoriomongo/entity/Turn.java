package com.meli.consultoriomongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("exams")
public class Turn {

    String id;
    Patient patient;
    Doctor doctor;
    String date;
    String status;
}
