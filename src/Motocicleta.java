import java.text.NumberFormat;
import java.util.Locale;

public class Motocicleta extends Vehiculo{
    private int cilindrada;
    public Motocicleta(String marca, String modelo, int cilindrada,Double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    public String toString(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","AR"));
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Cilindradas: " + getCilindrada()+"cc" + " // Precio: " + formatoImporte.format(super.getPrecio());
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
