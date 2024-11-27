package ejemplo_banco;

public class Cliente {

    public String nombre;    //Atributos del cliente
    private int cedula;
    
    public Cliente(String nombre, int cedula){    //Constructor
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }
 
}
