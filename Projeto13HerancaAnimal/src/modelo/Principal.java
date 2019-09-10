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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal = new Animal("Varios","Varios");
        Felino felino = new Felino("Carne","Selva e Urbano");
        Gato gato = new Gato("Persa","Carne","Urbano");
        Leao leao = new Leao("Africa","Carne","Savana");
        Tigre tigre = new Tigre("Dourado","Carne","Selva");
        
        Canino canino = new Canino("Carne","Varios");
        Lobo lobo = new Lobo(50,"Carne","Tundra");
        Cao cachorro = new Cao(40,"Carne","Urbano");
        
        
        System.out.println("Animal: " + "\nComida: " + animal.getComida() + " Habitat: " + animal.getHabitat());
        animal.makeNoise();
        System.out.println("\n");
        
        System.out.println("Felino: " + "\nComida: " + felino.getComida() + " Habitat: " + felino.getHabitat());
        felino.makeNoise();
        System.out.println("\n");
        
        System.out.println("Gato: " + "\nRaça: " + gato.getRaca() + " Comida: " + gato.getComida() +
                                                                      " Habitat: " + gato.getHabitat());
        gato.makeNoise();
        System.out.println("\n");
        
        System.out.println("Leão: " + "\nOrigem: " + leao.getOrigem() + " Comida: " + leao.getComida() +
                                                                      " Habitat: " + leao.getHabitat());
        leao.makeNoise();
        System.out.println("\n");
        
        System.out.println("Tigre: " + "\nCor: " + tigre.getCor() + " Comida: " + tigre.getComida() +
                                                                      " Habitat: " + tigre.getHabitat());
        tigre.makeNoise();
        System.out.println("\n");
        
        System.out.println("Canino: " + "\nComida: " + canino.getComida() + " Habitat: " + canino.getHabitat());
        canino.makeNoise();
        System.out.println("\n");
        
        System.out.println("Lobo: " + "\nPeso: " + lobo.getPeso() + "Kg Comida: " + lobo.getComida() +
                                                                      " Habitat: " + lobo.getHabitat());
        lobo.makeNoise();
        System.out.println("\n");
        
        System.out.println("Cão: " + "\nTamanho: " + cachorro.getTamanho() + "cm Comida: " + cachorro.getComida() +
                                                                         " Habitat: " + cachorro.getHabitat());
        cachorro.makeNoise();
        
    }
    
}
