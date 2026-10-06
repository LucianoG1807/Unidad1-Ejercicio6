import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        /*
        En el método main, instanciar dos boletos (uno con equipaje extra y otro sin él),
        invocar sus cálculos y mostrar los precios comparativos.
         */

        Scanner sc = new Scanner(System.in);

        BoletoVuelo vuelo1 = new BoletoVuelo(
                "Lucho",
                "Paises Bajos",
                5000
        );

        System.out.println("LLEVA EQUIPAJE EXTRA? (SI / NO)");
        var opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("SI")) {
            vuelo1.llevaEquipajeExtra = true;
        } else {
            vuelo1.llevaEquipajeExtra = false;
        }

        vuelo1.infoPasajero();
        System.out.println("PRECIO FINAL: $" + vuelo1.calcularPrecioFinal());

        BoletoVuelo vuelo2 = new BoletoVuelo(
                "Fiamma",
                "Brasil",
                3500
        );

        System.out.println("LLEVA EQUIPAJE EXTRA? (SI / NO)");
        var opcionn = sc.nextLine();

        if (opcionn.equalsIgnoreCase("SI")) {
            vuelo2.llevaEquipajeExtra = true;
        } else {
            vuelo2.llevaEquipajeExtra = false;
        }

        vuelo2.infoPasajero();
        System.out.println("PRECIO FINAL: $" + vuelo2.calcularPrecioFinal());
    }
}

