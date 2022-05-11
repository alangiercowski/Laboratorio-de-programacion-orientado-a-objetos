import static java.lang.Math.PI;

public class Area {

    public static double circulo(Double radio){
        return PI * radio * radio;
    }
    public static double esfera(Double radio){
        return 4 * PI * radio * radio;
    }
    public static double cuadrado(Double lado){
        return lado * lado;
    }
    public static double cubo(Double lado){
        return lado * lado * 6;
    }
    public static double cuadrado(Double base, Double altura){
        return (base * altura)/2;
    }
}
