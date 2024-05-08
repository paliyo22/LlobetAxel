import java.util.Objects;

public class Desk extends Products{
    private Double height;
    private Double length;

    public Desk(String name, Integer stock, Double price, Double height, Double length) {
        super(name, stock, price);
        this.height = height;
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desk desk)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(height, desk.height) && Objects.equals(length, desk.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, length);
    }

    @Override
    public String toString() {
        return "Desk{" +super.toString()+
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
