import java.util.Objects;

public abstract class Products {
    private String name;
    private Integer stock;
    private Double price;

    public Products(String name, Integer stock, Double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void updatePrice(double porcentaje){
        this.price=price+price*(porcentaje/100);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products products)) return false;
        return Objects.equals(name, products.name) && Objects.equals(stock, products.stock) && Objects.equals(price, products.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stock, price);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price;
    }
}
