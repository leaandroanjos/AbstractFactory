package br.com.leandro.abstractFactory;

public class Main {

    private static Carro montarCarro(String tipo){
        CarroFactory cf = null;
        if (tipo == "luxo"){
            cf = new CarroLuxoFactory();
        }
        else if (tipo == "popular") {
            cf = new CarroPopularFactory();
        }

        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }

    public static void main(String args[]){
        Carro c1 = montarCarro("luxo");
        Carro c2 = montarCarro("popular");

        System.out.println(c1);
        System.out.println(c2);
    }

}
