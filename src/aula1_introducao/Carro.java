package aula1_introducao;

public class Carro {
   public String marca;
   public String modelo;
   public Integer ano;
   public String cor;
   public Double preco;

   public Carro() {}

   public Carro(String marca, String modelo, Integer ano, String cor, Double preco) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.cor = cor;
      this.preco = preco;
   }

   public void acelerar() {
      System.out.println("O carro está acelerando");
   }

   public void frear() {
      System.out.println("O carro está freando");
   }

   public void exibirInformacoes() {
       System.out.println("Carro{" +
              "marca='" + marca + '\'' +
              ", modelo='" + modelo + '\'' +
              ", ano=" + ano +
              ", cor='" + cor + '\'' +
              ", preco=" + preco);
   }
}
