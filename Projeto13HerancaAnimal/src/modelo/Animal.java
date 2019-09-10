/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Animal {
    
    //ATRIBUTOS
    protected String comida;
    protected String habitat;
    
    //CONSTRUTORES
    //VAZIO
    public Animal() {
    }
    //CHEIO
    public Animal(String comida, String habitat) {
        this.comida = comida;
        this.habitat = habitat;
    }
    
    //GETTERS E SETTERS
    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void makeNoise() {
        System.out.println("Fazer Barulho");
    }
}
