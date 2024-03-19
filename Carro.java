package br.com.leandro.abstractFactory;

public class Carro {

    Roda roda;

    Som som;

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "roda=" + roda.nome +
                ", som=" + som.nome +
                '}';
    }
}
