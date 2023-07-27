package teste;

public class Dolar extends Moeda {
    public String info() {
        return "Dólar";
    }

    public double converter() {
        return this.getValor() * 5;
    }
}
