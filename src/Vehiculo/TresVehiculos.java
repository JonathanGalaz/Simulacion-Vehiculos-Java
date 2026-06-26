package Vehiculo;

public class TresVehiculos {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo(1);
        Vehiculo vehiculo2 = new Vehiculo(2);
        Vehiculo vehiculo3 = new Vehiculo(3);

        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();

    }

}