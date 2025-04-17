import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tim Burtom";
        String TipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;


//Agregar datos del cliente
        System.out.println("******************************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta:" + TipoDeCuenta);
        System.out.println("Saldo Disponible: $" + saldo);
        System.out.println("\n******************************************");

//Agregar menu
        String menu = """
               *** Escriba el número de la opción deseada ***
               1. Consultar saldo
               2. Retirar
               3. Depositar
               4. Salir
                """;
 //ciclo menu

        Scanner teclado = new Scanner(System.in);
        while (opcion != 4){
            System.out.println(menu);
            opcion = teclado.nextInt();

 //
            switch (opcion){
                case 1:
                    System.out.println("El saldo hasta la fecha es:" + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if(valorARetirar > saldo){
                        System.out.println("Saldo es insuficiente");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("el saldo actualizado es " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("el saldo actualizado es:" + saldo + "$");
                    break;
                case 4:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida");

            }
            {

            }
        }


    }
}
