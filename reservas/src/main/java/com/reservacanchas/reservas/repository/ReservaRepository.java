package com.reservacanchas.reservas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.reservacanchas.reservas.entities.Reserva;

@Repository
public class ReservaRepository {

     // Arreglo que guardara todos los libros
    private List<Reserva> listaReservas = new ArrayList<>();

     // Metodo que retorna todas las Reservas
    public List<Reserva> obtenerReservas() {
        return listaReservas;
    }

    // Buscar una Reserva por su id
    public Reserva buscarPorId(Long id) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
    }

    public Reserva guardar(Reserva res) {
        listaReservas.add(res);
        return res;
    }
}
