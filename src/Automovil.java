import java.text.NumberFormat;
import java.util.Locale;

public class Automovil extends Vehiculo{
    private int puertas;

    public Automovil(String marca, String modelo,  int puertas, Double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String toString(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","AR"));
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: " + getPuertas() + " // Precio: " + formatoImporte.format(super.getPrecio());
    }

    @Override
    public int compareTo(Vehiculo o) {
        if (this.getPrecio() < o.getPrecio())
            return -1;
        else if (this.getPrecio() > o.getPrecio())
            return 1;
        else
            return 0;
    }
}
