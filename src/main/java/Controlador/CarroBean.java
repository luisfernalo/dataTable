/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author luis fernando
 */
@Named(value = "carroBean")
@RequestScoped
public class CarroBean {
    /***
     * se inicializa al earray donde tendra los datos
     * uno quemado para las marcas
     * un objeto del carro 
     */
    private Carro carro = new Carro();
    private static List<Carro> listacarros = new ArrayList();
    String[] marcasmenu={"Nissan", "Hyundai", "Chevrolet", "Kia"};

    public String[] getMarcasmenu() {
        return marcasmenu;
    }

    public void setMarcasmenu(String[] marcasmenu) {
        this.marcasmenu = marcasmenu;
    }
   

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getListacarros() {
        return listacarros;
    }

    public void setListacarros(List<Carro> listacarros) {
        CarroBean.listacarros = listacarros;
    }
    /***
     * un metodo para agregar satos en una lista
     */
    public void agregarCarro(){
        CarroBean.listacarros.add(this.carro);  
    }
    /**
     * Creates a new instance of CarroBean
     */
    public CarroBean() {
    }
    
}
