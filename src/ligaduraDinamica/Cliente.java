package ligaduraDinamica;

public class Cliente extends Persona{
    protected final int id;

    public Cliente(String nombre, int id){
        super(nombre);
        this.id = id;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Soy un cliente y me llamo "
                + nombre + ". Mi ID es " + id);
    }
}
