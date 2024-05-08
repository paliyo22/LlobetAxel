import java.util.Objects;

public abstract class Informatic extends Products {
    private String fabricante;

    public Informatic(String name, Integer stock, Double price, String fabricante) {
        super(name, stock, price);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public abstract String informacion();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Informatic that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(fabricante, that.fabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fabricante);
    }

    @Override
    public String toString() {
        return super.toString()+", fabricante='" + fabricante + '\'';
    }
}
