/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author MiguelGz
 */
public class Cliente {
    private String nombre;
    private String numtarjet;
    private String fechacaduca;
    private String ciudad;
    private String equipo;
    private String pantalla;
    private String camara;
    private String procesa;
    private String plan;
    private String precio;

    public Cliente() {
    }

    public Cliente(String nombre, String numtarjet, String fechacaduca, String ciudad, String equipo, String pantalla, String camara, String procesa, String plan, String precio) {
        this.nombre = nombre;
        this.numtarjet = numtarjet;
        this.fechacaduca = fechacaduca;
        this.ciudad = ciudad;
        this.equipo = equipo;
        this.pantalla = pantalla;
        this.camara = camara;
        this.procesa = procesa;
        this.plan = plan;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumtarjet() {
        return numtarjet;
    }

    public void setNumtarjet(String numtarjet) {
        this.numtarjet = numtarjet;
    }

    public String getFechacaduca() {
        return fechacaduca;
    }

    public void setFechacaduca(String fechacaduca) {
        this.fechacaduca = fechacaduca;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getProcesa() {
        return procesa;
    }

    public void setProcesa(String procesa) {
        this.procesa = procesa;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
    
}
