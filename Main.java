import java.sql.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(1,2,5);
        //List<Double> resultados = equacao.calculaEquacaoSegundoGrau();

        //System.out.println("RESULTADOS=" + resultados);

        List<Double> lista = List.of(1.80,1.70,1.55);
        DesvioPadrao desvio = new DesvioPadrao(lista);
        System.out.println("RSULTADO=" + desvio.calculaDesvioPadrao());


    }
}