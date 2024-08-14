package exercicios1;

public class Triangulo {
    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public boolean ehValido() {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }

    //fórmula de Heron para calcular a área do triângulo: 
    //area = (s⋅(s−a)⋅(s−b)⋅(s−c))-> tudo em raiz quadrada | s -> semiperimetro
    public Double calcularAltura() {
    	Double semiPerimetro = (lado1 + lado2 + lado3) / 2;
    	Double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        return area;
    }

}
