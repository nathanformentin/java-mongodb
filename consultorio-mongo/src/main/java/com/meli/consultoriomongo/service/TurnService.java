package com.meli.consultoriomongo.service;

import com.meli.consultoriomongo.entity.Turn;
import org.springframework.stereotype.Service;
import com.meli.consultoriomongo.repository.TurnRepository;

import java.util.List;

@Service
public class TurnService {

    final TurnRepository examRepository;

    public TurnService(TurnRepository examRepository) {
        this.examRepository = examRepository;
    }


    public List<Turn> getAllTurns() {
        return examRepository.findAll();
    }

    public List<Turn> getDentistExams(String dni) {
        return examRepository.findAllByDoctor_Dni(dni);
    }

    public List<Turn> getTurnsByStatus(String status) {
        return examRepository.findAllByStatus(status);
    }

}
