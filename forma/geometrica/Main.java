package forma.geometrica;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        System.out.println("\n--------------- Quadrado ---------------\n");
        quadrado.area(4,4);
        System.out.println(quadrado);

        System.out.println("\n--------------- Tri�ngulo ---------------\n");
        Triangulo triangulo = new Triangulo();
        triangulo.area(4,5);
        System.out.println(triangulo);

        System.out.println("\n--------------- Ret�ngulo ---------------\n");
        Retangulo retangulo = new Retangulo();
        retangulo.area(8,4);
        System.out.println(retangulo);

        System.out.println("\n--------------- C�rculo ---------------\n");
        Circulo circulo = new Circulo();
        circulo.area(8);
        System.out.println(circulo);
    }
}
