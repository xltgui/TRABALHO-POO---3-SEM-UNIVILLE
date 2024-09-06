import java.util.ArrayList;
import java.util.List;

public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Double> calculaEquacaoSegundoGrau() {
        List<Double> resultado = new ArrayList<>();

        double delta = (b * b) - (4 * a * c);

        if (delta >= 0) {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);

            resultado.add(x1);
            resultado.add(x2);
        } else {
            throw new IllegalArgumentException("DELTA NEGATIVO, DIGITE OUTROS VALORES");
        }
        return resultado;
    }
}
