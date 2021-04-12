public class TestaCodigo {
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        circulo.getArea(2);
        Quadrado quad = new Quadrado();
        quad.getAreaQuadrado(2); 
        Triangulo tri = new Triangulo();
        tri.getArea(2, 3);
        Trapezio trap = new Trapezio();
        trap.getArea(6, 4, 3);
        System.out.println("\n\nA area do Triangulo é:"+tri.area);
        System.out.println("\n\nA area do Quadrado é:"+quad.area);
        System.out.println("\n\nA area da Circunferencia é:"+circulo.area);
        System.out.println("\n\nA area do Triangulo é:"+trap.area+"\n\n");
       
    }
}
