package fruteriaed;

import java.util.Scanner;

public class FruteriaEd {

    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Numero de Clientes?");
        int num = scanner.nextInt();
        Cola s = new Cola(num);
        do {
            System.out.println("Fruteria Cryptos MIP");
            System.out.println("--------------------------");
            System.out.println("1. Despachar.");
            System.out.println("2. Adelantar.");
            System.out.println("3. Restrasar.");
            System.out.println("4. Mostrar Clientes Actuales.");
            System.out.println("5. Mostrar Clientes Despachados.");
            System.out.println("6. Salir.");
            System.out.print("opción? >>");
            opcion = scanner.nextInt();

        } while (opcion != 6);
        //salgo del bucle cuando ponga 6
        System.out.println("");
        System.out.println("");
        System.out.println("Gracias por su visita!!");
    }
}
