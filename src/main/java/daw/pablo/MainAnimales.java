/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package daw.pablo;

/**
 *
 * @author samue
 */
public class MainAnimales {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Animal a1 = new Animal("Landi", "Perro", 20000, "Durmiendo", "11/05/2019");

        Animal a2 = new Animal("Mimi", "Gato", 3000, "Durmiendo", "25/07/2021");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        Animal a3 = new Animal(a2);
        System.out.println("ANIMAL 3 COPIADO CON LOS DATOS DEL ANIMAL 2");
        System.out.println(a3);
        //Personas
        Persona p1 = new Persona("Pablo", 25);

        Persona p2 = new Persona("Samuel", 31);

        System.out.println(p1);
        System.out.println(p2);

        //p1 debe despertar a todos los animales.
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);
        //Despertando a los bichos
        System.out.println(a1.getEstado());
        System.out.println(a2.getEstado());
        System.out.println(a3.getEstado());
        //Persona va a jugar 
        p2.jugar(a1, 120);
        //Resultado de jugar
        System.out.println(a1.getEstado());

        //Alimentar
        p1.alimentar(a1, 1000);
        
        System.out.println("El peso del animal pasa a ser : "+a1.getPeso());
        
        //Prueba de tiempo
        
        p1.jugar(a1, 200);
       
        System.out.println(a1.getPeso());
        
    }
}
