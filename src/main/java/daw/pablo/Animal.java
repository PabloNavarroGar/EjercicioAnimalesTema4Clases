/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.pablo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author samue
 */
public class Animal {

    //Atributos
    private LocalDate fechaHoy = LocalDate.now();
    
    private String nombre;
    private String tipoAnimal;// "gato", "perro", "lagarto", "cobaya", "periquito"
    private double peso;
    private String estado; //"comiendo", "durmiendo", "despierto/reposo" o "jugando".

//FORMATEAR LAS FECHAS 
    //dd dias con dos numeritos
    //mm mes con 2  numeritos
    //yyyy año
    private DateTimeFormatter formatofechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String fechaNacimiento = fechaHoy.format(formatofechas);

    public Animal() {
    }

    public Animal(String nombre, String tipoAnimal, double peso, String estado, String fecha) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.peso = peso;
        this.estado = estado;
        this.fechaNacimiento = fecha;
    }

    public LocalDate getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(LocalDate fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DateTimeFormatter getFormatofechas() {
        return formatofechas;
    }

    public void setFormatofechas(DateTimeFormatter formatofechas) {
        this.formatofechas = formatofechas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Animal{"
                + "  nombre=" + nombre
                + "\n, tipoAnimal=" + tipoAnimal
                + "\n, peso=" + peso
                + "\n, estado=" + estado
                + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public static void comer(Animal animal, double cantidadGramos) {
        //Se suma en el peso, la cantidad que su peso+ mas la cantida de comida que recibira
        //No admite negativo
        cantidadGramos = Math.abs(cantidadGramos);
        animal.setPeso(animal.getPeso() + cantidadGramos);

    }

    public static void dormir(Animal animal) {

        animal.setEstado("dormir");
    }

    public static void despertar(Animal animal) {

        animal.setEstado("despierto");
    }

    public static void descansar(Animal animal) {

        animal.setEstado("reposo");

    }

    public int jugar(Animal animal, int cantidadMinutos) {
        /* este método le indica a la mascota que está jugando 
        y recibe como parámetro la cantidad de minutos que estará
        el animal jugando. Por cada 30 minutos completos de juego,
        el peso del animal se verá reducido en 20 gr. Si la cantidad
        es menor de 30 minutos, se reducirá en 10 gramos. Si la cantidad
        de minutos es negativa se considera positiva. Un animal no puede 
        jugar más de 180 minutos, por lo tanto si se supera esa cantidad se
        lanzará una excepción de tipo IllegalArgument.*/
        if (cantidadMinutos > Math.abs(30)) {
            animal.setPeso(animal.getPeso() - 20);

        }
        if (cantidadMinutos < Math.abs(30)) {
            animal.setPeso(animal.getPeso() - 10);
        }
        try {

        } catch (IllegalArgumentException npe) {
            if (cantidadMinutos > Math.abs(180)) {

            }
            System.out.println("El animal no puede jugar mas de 180 minutos");
        }

        return cantidadMinutos;
    }

    public static Animal clonar(Animal pet) {
        Animal copiarAnimal = new Animal();
        try {

            copiarAnimal = pet;
        } catch (NullPointerException npe) {
            System.out.println("Dato en nulo,esta vacio");

        }

        return copiarAnimal;
    }

    public Animal(Animal origen) {
        this.nombre =origen.nombre;
        this.tipoAnimal = origen.tipoAnimal;
        this.peso = origen.peso;
        this.estado = origen.estado;
        this.fechaNacimiento=origen.fechaNacimiento;
    }

    
    public static  Animal copiar(Animal origen){
        Animal aux= new Animal(origen.nombre, origen.tipoAnimal, origen.peso, origen.estado, origen.fechaNacimiento);
        
        
        return aux;
    }
}
