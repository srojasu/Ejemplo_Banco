package ejemplo_banco;
public class Ejemplo_Banco {

    
    public static void main(String[] args) {
        Cliente uno = new Cliente("Pedro", 1123879);      //Crear primero los clientes para poder crear las cuentas
        Cliente dos = new Cliente("Pablo", 1092851);
        
        Cuenta cuenta1 = new Cuenta(uno.nombre, 1000000, uno.getCedula());  //Ambas cuentas tienen un saldo inicial de 1000000
        Cuenta cuenta2 = new Cuenta(dos.nombre, 1000000, dos.getCedula());
        
        double x = cuenta1.getSaldo();              //Verificar el saldo de la cuenta
        System.out.println("Saldo actual: " + x);    
        
        cuenta1.retirar(500000);                   //Se usa el metodo retirar especificando el monto
        double y = cuenta1.getSaldo();
        System.out.println("Retiro realizado con exito. Saldo actual: " + y);
        
        cuenta1.consignacion(3000000);          //Se usa el metodo consignacion especificando el monto
        double v = cuenta1.getSaldo();
        System.out.println("Consignacion realizada con exito. Saldo actual: "+ v);
        
        cuenta1.transferir(cuenta2, 2000000); //La cuenta 1 usa el metodo transferir especificando a que cuenta y el monto
        double e = cuenta1.getSaldo();
        System.out.println("Transferencia realizada con exito. Saldo actual: "+ e);
        
        double l = cuenta2.getSaldo();       //Se comprueba que si se realizara la transferencia
        System.out.println("Saldo final cuenta 2: "+ l);
      
    }
    
}
