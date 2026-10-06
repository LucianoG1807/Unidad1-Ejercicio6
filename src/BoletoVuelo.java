public class BoletoVuelo {

    String pasajero;
    String destino;
    double tarifaBase;
    boolean llevaEquipajeExtra;

    public BoletoVuelo (String pasajero, String destino, double tarifaBase) {
        this.pasajero = pasajero;
        this.destino = destino;
        this.tarifaBase = tarifaBase;
    }

    double calcularPrecioFinal() {
        if (llevaEquipajeExtra == true) {
            var adicional = tarifaBase * 20 / 100;
            return tarifaBase + adicional;
        }
        else {
            return tarifaBase;
        }
    }

    void infoPasajero () {
        System.out.println("NOMBRE: " + this.pasajero);
        System.out.println("DESTINO: " + this.destino);
    }
}
