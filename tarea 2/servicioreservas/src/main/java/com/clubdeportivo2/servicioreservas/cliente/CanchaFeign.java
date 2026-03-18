package com.clubdeportivo2.servicioreservas.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.clubdeportivo2.servicioreservas.model.dto.Cancha;

@FeignClient(name = "serviciocanchas", url="http://localhost:8081")
public interface CanchaFeign {

    @GetMapping("/api/canchas/{id}")
    Cancha getCanchaById(@PathVariable("id") Long id);
}
