package teste;

public class Euro extends Moeda {
    public String info() {
        return "Euro";
    }

    public double converter() {
        return this.getValor() * 5.5;
    }
}
