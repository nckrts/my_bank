package teste;

public class Real extends Moeda {
    public String info() {
        return "Real";
    }

    public double converter() {
        return this.getValor();
    }
}
