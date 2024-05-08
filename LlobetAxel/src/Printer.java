import java.util.Objects;

public class Printer extends Informatic implements Oferta {
    private Integer imprecionesMinuto;

    public Printer(String name, Integer stock, Double price, String fabricante, Integer imprecionesMinuto) {
        super(name, stock, price, fabricante);
        this.imprecionesMinuto = imprecionesMinuto;
    }

    public Integer getImprecionesMinuto() {
        return imprecionesMinuto;
    }

    public void setImprecionesMinuto(Integer imprecionesMinuto) {
        this.imprecionesMinuto = imprecionesMinuto;
    }

    @Override
    public String informacion() {
        return ("Imprime "+imprecionesMinuto+" por minuto");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Printer printer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(imprecionesMinuto, printer.imprecionesMinuto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), imprecionesMinuto);
    }

    @Override
    public String toString() {
        return "Printer{" +super.toString()+", "+
                this.informacion()+
                '}';
    }

    @Override
    public Double descuento(double porcentaje) {
        return this.getPrice()-this.getPrice()*(porcentaje/100);
    }
}
