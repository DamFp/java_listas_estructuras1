package ligaduraDinamica;
//1.	Crear una clase Persona que tenga un atributo nombre y un método mostrarInfo()
//que imprima información genérica sobre la persona.
public class Persona {
    protected String nombre;

    //CONSTRUCTOR
    public Persona(String nombre){
        this.nombre = nombre;
    }


    public void mostrarInfo(){
        System.out.println("Soy un cliente y me llamo " + nombre);
    }
}
