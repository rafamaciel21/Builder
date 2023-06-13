package org.example.Builder;

public class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private int km;
        private double valor;

        protected Carro() {
        }
        public static Carro builder(){
            return new Carro();
        }
        protected void setMarca(String marca){
            this.marca=marca;
        }
        protected void setModelo(String modelo){
            this.modelo=modelo;
        }
        protected void setAno(int ano){
            this.ano=ano;
        }
        protected void setKm(int km){
            this.km=km;
        }

        protected void setValor(double valor){
        this.valor=valor;
    }


        @Override
        public String toString() {
            return "Tipo Veiculo: Carro\n" +
                    "marca:'" + marca + '\n' +
                    "modelo:'" + modelo + '\n' +
                    "ano:" + ano+ '\n' +
                    "km:" + km + '\n' +
                    "valor:" + valor + '\n';
        }

//    public static class Veiculo {
//        private String marca;
//        private String modelo;
//        private int ano;
//        private int km;
//
//        public Veiculo() {
//        }
//
//        public Veiculo marca(String marca) {
//            this.marca = marca;
//            return this;
//
//        }
//
//        public Veiculo modelo(String modelo) {
//            this.modelo = modelo;
//            return this;
//        }
//
//        public Veiculo ano(int ano) {
//            this.ano = ano;
//            return this;
//        }
//
//        public Veiculo km(int km) {
//            this.km = km;
//            return this;
//        }
//
//        public Carro build() {
//            return new Carro(this);
//        }
//
//    }


}
