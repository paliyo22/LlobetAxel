import java.util.Objects;

public class Notebook extends Informatic{
    private Integer memory;

    public Notebook(String name, Integer stock, Double price, String fabricante, Integer memory) {
        super(name, stock, price, fabricante);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }


    @Override
    public String informacion() {
        return "Tiene una memoria de "+memory+" gb.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(memory, notebook.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memory);
    }

    @Override
    public String toString() {
        return "Notebook{" +super.toString()+
                ", "+this.informacion()+
                '}';
    }
}
