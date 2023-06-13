package org.example.Builder;

public class VeiculoBuilder {
    private Carro carro; // criando um objeto do tipo carro

    private VeiculoBuilder(){
        carro = new Carro(); // construtor
    }

    public static VeiculoBuilder builder(){
        return new VeiculoBuilder();
    }

    public  VeiculoBuilder marca(String marca){
        this.carro.setMarca(marca);
        return this;
    }
    public  VeiculoBuilder modelo(String modelo){
        this.carro.setModelo(modelo);
        return this;
    }
    public  VeiculoBuilder ano(int ano){
        this.carro.setAno(ano);
        return this;
    }
    public  VeiculoBuilder km(int km){
        this.carro.setKm(km);
        return this;
    }
    public  VeiculoBuilder valor(double valor){
        this.carro.setValor(valor);
        return this;
    }


    public Carro build(){
        return this.carro;
    }





}
