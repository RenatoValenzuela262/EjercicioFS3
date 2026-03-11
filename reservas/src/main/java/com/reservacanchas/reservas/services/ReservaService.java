package com.reservacanchas.reservas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservacanchas.reservas.entities.Reserva;
import com.reservacanchas.reservas.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getReservas(){
        return reservaRepository.obtenerReservas();
    }

    public Reserva getReservaId(Long id){
        return reservaRepository.buscarPorId(id);
    }

    public Reserva saveReserva(Reserva reserva){
        return reservaRepository.guardar(reserva);
    }

}
