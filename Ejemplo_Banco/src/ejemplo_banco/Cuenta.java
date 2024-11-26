package ejemplo_banco;

public class Cuenta {
   
    private String Titular;   //Atributos de la clase cuenta
    private double Saldo;
    private int id;
   
    public Cuenta(String Titular, double Saldo, int id){    //Constructor
        this.Titular = Titular; // Asignar el valor del parámetro a la variable de instancia
        this.Saldo = Saldo;     //indicar que se refiere al atributo de la clase y no al parámetro del constructor.
        this.id = id;
    }


    boolean consignacion(double x){    //Se crea el metodo consignacion
        boolean aprovar = true;
        if(aprovar == true){
            if(x > 0){                //Desde que el valor a consignar sea mayor a 0 cualquier monto esta permitido
                Saldo = Saldo + x;
            return true;
            }else{
                return false;
            }
        }else{
            return false;
        }  
    }

     
    boolean retirar(double x){      //Se crea el metodo retirar
        boolean aprovar = true;
        if(aprovar == true){
            if(x > 0 && Saldo >= x) {      //Desde que el monto a retirar sea mayor a 0 y el saldo sea igual o mayor que el monto a retirar se ejecuta
              Saldo = Saldo - (x + 2600);
            return true;  
            }else{
                return false;
            }  
        }else{
            return false;
        }
    }
   
    boolean transferir(Cuenta destino, double x) {
        if (x > 0 && Saldo >= x) {  //Si la transferencia es un monto mayor a 0 y el saldo es mayor o igual a la transferencia
            Saldo -= x;          // Retira el monto de la cuenta
            destino.consignacion(x); // Consigna el monto en la cuenta destino
            return true;
        } else {
            return false;
        }
    }
   
   
   
    //Getters
    public double getSaldo() {
        return Saldo;
    }

    public String getTitular() {
        return Titular;
    }
   
   
}