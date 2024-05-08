import java.util.Objects;

public class Chair extends Products implements Oferta{
    private Boolean ruedas;
    public Chair(String name, Integer stock, Double price, Boolean ruedas) {
        super(name, stock, price);
        this.ruedas = ruedas;
    }
    public Boolean getRuedas() {
        return ruedas;
    }
    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair chair)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(ruedas, chair.ruedas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ruedas);
    }

    @Override
    public String toString() {
        return "Chair{"+super.toString()+
                ", ruedas=" + ruedas +
                '}';
    }

    @Override
    public Double descuento(double porcentaje) {
        return this.getPrice()-this.getPrice()*(porcentaje/100);
    }

}
