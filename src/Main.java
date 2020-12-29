import java.text.NumberFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String []args){
        Automovil auto1 = new Automovil("Peugeot",  "206", 4,200000.00);
        Motocicleta moto1 = new Motocicleta("Honda","Titan",125, 60000.00);
        Automovil auto2 = new Automovil("Peugeot",  "208", 5,250000.00);
        Motocicleta moto2 = new Motocicleta("Yamaha ","YBR",160, 80500.50);
        LinkedList <Vehiculo> vehiculos = new LinkedList<Vehiculo>();
        vehiculos.add(auto1);
        vehiculos.add(moto1);
        vehiculos.add(auto2);
        vehiculos.add(moto2);
        for (Vehiculo v: vehiculos) {
            System.out.println(v.toString());
        }
        System.out.println("=============================================");
        Vehiculo v1 = Collections.max(vehiculos);
        System.out.println("Vehículo más caro: " + v1.getMarca() + " " + v1.getModelo() );
        Vehiculo v2 = Collections.min(vehiculos);
        System.out.println("Vehículo más barato: " + v2.getMarca() + " " + v2.getModelo() );
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","AR"));
        for (Vehiculo v : vehiculos) {
            if (v.getMarca().contains("Y")) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + v.getMarca() +" " + v.getModelo() + " " + formatoImporte.format(v.getPrecio()));
            }
        }
        System.out.println("=============================================");
        Collections.sort(vehiculos);
        Collections.reverse(vehiculos);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo v: vehiculos) {
            System.out.println(v.getMarca() + " "+ v.getModelo());
        }

    }
}
