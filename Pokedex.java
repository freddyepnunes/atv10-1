/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eevee;

/**
 *
 * @author Gabriel Boschi Rgm:11211100784
 *  @author Freddye Pontes Rgm:11211202211
 */
public class Pokedex {
    public static void main(String args[]) {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Umbreon u = new Umbreon();
        Leafeon l = new Leafeon();
        Flareon f = new Flareon();
        Vaporeon v = new Vaporeon();
        Espeon s = new Espeon();
        Glaceon g = new Glaceon();
        Sylveon y = new Sylveon();

        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = j;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = u;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = l;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = f;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = v;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = s;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = g;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

//aponta Pokemon
        e = y;
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa " + e.Defesa());
        System.out.println("--------------------------------------");

    }

}
