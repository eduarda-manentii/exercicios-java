import aula1_introducao.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Iares";
        carro.ano = 2020;
        carro.cor = "Preto";
        carro.preco = 9000.0;
        carro.exibirInformacoes();
    }

}