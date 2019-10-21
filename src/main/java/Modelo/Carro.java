/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author luis fernando
 */
public class Carro {
   /**
    * una clase donde estara los datos del data table
    */

   private String nombre;
   private String marca;

   private int modelo;
   String[] marcasmenu={"Nissan", "Hyundai", "Chevrolet", "Kia"};
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String[] getMarcasmenu() {
        return marcasmenu;
    }

    public void setMarcasmenu(String[] marcasmenu) {
        this.marcasmenu = marcasmenu;
    }
   
}
