package com.reservacanchas.reserva.reservas.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.reservacanchas.reserva.reservas.Entities.Cancha;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/canchas")
public class CanchaController {

    private List<Cancha> listaCanchas = new ArrayList<>();

    @GetMapping
    public List<Cancha> ListCanchas(){
        return listaCanchas;
    }
    
    @PostMapping
    public void agregarCancha(@RequestBody Cancha cancha){
        listaCanchas.add(cancha);
    }

    @GetMapping("/{id}")
    public Cancha buscarCanchaId(@PathVariable int id){
        for(Cancha cancha : listaCanchas){
            if(cancha.getId( )== id) return cancha;
        }
        return null;
    }
    
    
}
