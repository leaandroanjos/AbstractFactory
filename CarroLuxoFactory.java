package br.com.leandro.abstractFactory;

public class CarroLuxoFactory extends CarroFactory{

    public Roda montarRoda() {
        return new RodaLigaLeve("Roda de Luxo");
    }

    public Som montarSom() {
        return new CDPlayer("Tocador de CD");
    }
}
