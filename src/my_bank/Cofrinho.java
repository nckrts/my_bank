package teste;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

    private List<Moeda> moeda;

    public Cofrinho() {
        moeda = new ArrayList<>();
    }

    public void adicionar(Moeda moedaParametro) {
        Boolean adicionarNovo = true;
        for (Moeda moedaLista : moeda) {
            if (moedaLista.getClass().equals(moedaParametro.getClass())) {
                moedaLista.setValor(moedaLista.getValor() + moedaParametro.getValor());
                adicionarNovo = false;
                break;
            }
        }

        if (adicionarNovo) {
            this.moeda.add(moedaParametro);
        }
    }

    public void remover(Moeda classeMoeda, double valor) {

        for (Moeda moedaLista : moeda) {
            if (moedaLista.getClass().equals(classeMoeda.getClass())) {
                if (moedaLista.getValor() < valor) {
                    System.out.println("Valor inválido");
                } else if (moedaLista.getValor() == valor) {
                    this.moeda.remove(moedaLista);
                    System.out.println("Moeda removida");
                } else {
                    moedaLista.setValor(moedaLista.getValor() - valor);
                    System.out.println("Saldo: " + moedaLista.getValor());
                }
                break;
            }
        }

    }

    public List<Moeda> listar() {
        return moeda;
    }

    public double totalConvertidoReal() {
        double total = 0;
        for (Moeda moedaLista : moeda) {

            total += moedaLista.converter();
        }
        return total;
    }

}