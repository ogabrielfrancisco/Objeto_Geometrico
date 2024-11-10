package formas;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        Forma retangulo = new Retangulo(4, 6);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
