package com.reservacanchas.reserva.reservas.Entities;





public class Cancha {

    private int id;
    private String nombre, tipo;
    private int precioHora;
    
    public Cancha() {
    }

    public Cancha(int id, String nombre, String tipo, int precioHora) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioHora = precioHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    
}
