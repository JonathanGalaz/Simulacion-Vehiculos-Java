package Vehiculo;

public class Vehiculo extends Thread {

    private int numeroVehiculo;

    public Vehiculo(int numeroVehiculo) {
        this.numeroVehiculo = numeroVehiculo;
    }

    @Override
    public void run() {
        System.out.println("Vehículo " + numeroVehiculo + " está en movimiento.");
    }

}