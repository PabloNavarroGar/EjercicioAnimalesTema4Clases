/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.pablo;

/**
 *
 * @author samue
 */
public class Persona {

    //Atributos
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void llamar(Animal pet) {

        pet.setEstado(pet.getNombre() + " ,despierta!!!");

    }

    //QUITAR LOS STATIC PARA PODER USARLOS EN EL MAIN
    public void alimentar(Animal pet, double cantidadGramos) {

        Animal.comer(pet, cantidadGramos);
    }

    public void jugar(Animal pet, int cantidadMinutos) {
        try {

            if (cantidadMinutos <= 180) {
                System.out.println("Dentro de If");
                pet.setEstado("jugando con el humano");

            } else {
                throw new IllegalArgumentException();//expecion
            }
        } catch (IllegalArgumentException ime) {
            
            System.out.println("El tiempo maximo es 180 como permitido, por lo cual se pondra a 180");
            cantidadMinutos=180;
        }
    }

}
