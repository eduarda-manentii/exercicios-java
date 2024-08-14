package exercicios1;

public class Carro {
   public String marca;
   public String modelo;
   public Double velocidadeAtual;

   public Carro() {}

   public Carro(String marca, String modelo, Double velocidadeAtual) {
      this.marca = marca;
      this.modelo = modelo;
      this.velocidadeAtual = velocidadeAtual;
   }

   public void acelerar(Double velocidade) {
	  velocidadeAtual += velocidade;
      System.out.println("O carro está acelerando " + velocidade + "KM/H.");
   }

   public void frear(Double velocidade) {
	  velocidadeAtual -= velocidade;
	  System.out.println("O carro está freando " + velocidade + "KM/H.");
   }

   public void exibirInformacoes() {
       System.out.println("A velocidade atual é " + velocidadeAtual + "KM/H.");
   }
}
