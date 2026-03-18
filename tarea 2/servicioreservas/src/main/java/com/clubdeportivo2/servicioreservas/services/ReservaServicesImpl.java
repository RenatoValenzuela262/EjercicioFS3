package com.clubdeportivo2.servicioreservas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feign.FeignException;

import com.clubdeportivo2.servicioreservas.cliente.CanchaFeign;
import com.clubdeportivo2.servicioreservas.model.Reserva;
import com.clubdeportivo2.servicioreservas.model.dto.Cancha;
import com.clubdeportivo2.servicioreservas.repository.ReservaRepository;
import java.util.List;



@Service
public class ReservaServicesImpl implements ReservaServices {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private CanchaFeign canchaFeign;
    
    @Override
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    /*
    @Override
    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    */

    @Override
    public Reserva crearReserva (Reserva reserva){
        try {
                Cancha cancha = canchaFeign.getCanchaById(reserva.getCanchaId());
                return reservaRepository.save(reserva);
            } catch (feign.FeignException.NotFound e) {
                throw new RuntimeException("La cancha no existe");
            }
    }


    @Override
    public List<Reserva> buscarReservasPorCancha(Long canchaId) {
        return reservaRepository.findByCanchaId(canchaId);
    }

    

}
