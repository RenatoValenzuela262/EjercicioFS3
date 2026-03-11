package com.reservacanchas.reservas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservacanchas.reservas.entities.Reserva;
import com.reservacanchas.reservas.services.ReservaService;


@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> listaReservas(){
        return reservaService.getReservas();
    }

    @GetMapping("{id}")
    public Reserva getReserva(@PathVariable Long id) {
        return reservaService.getReservaId(id);
    }
    @PostMapping
    public Reserva agregarReserva(@RequestBody Reserva reserva){
        return reservaService.saveReserva(reserva);
    }
}
