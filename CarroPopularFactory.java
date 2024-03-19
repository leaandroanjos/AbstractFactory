package br.com.leandro.abstractFactory;

public class CarroPopularFactory extends CarroFactory{

    public Roda montarRoda() {
        return new RodaSimples("Roda Popular");
    }

    public Som montarSom() {
        return new TocaFitas("Toca Fitas");
    }



}
