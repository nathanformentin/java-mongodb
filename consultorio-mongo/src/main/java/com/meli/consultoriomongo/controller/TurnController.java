package com.meli.consultoriomongo.controller;

import com.meli.consultoriomongo.entity.Turn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.meli.consultoriomongo.service.TurnService;

import java.util.List;

@RestController
@RequestMapping("consultorio")
public class TurnController {

    private final TurnService examService;

    public TurnController(TurnService examService) {
        this.examService = examService;
    }

    @GetMapping
    @RequestMapping("/turns")
    public List<Turn> getAllTurns() {
        return this.examService.getAllTurns();
    }

    @GetMapping
    @RequestMapping("/turns/{status}")
    public List<Turn> getTurnsByState(@PathVariable String status) {
        return this.examService.getTurnsByStatus(status);
    }

    @GetMapping
    @RequestMapping("/doctor/exams/{dni}")
    public List<Turn> getDentistExams(@PathVariable String dni) {
        return this.examService.getDentistExams(dni);
    }


}
