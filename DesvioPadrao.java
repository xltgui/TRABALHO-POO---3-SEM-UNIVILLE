import java.util.List;

public class DesvioPadrao {
    double somatario = 0;
    double media = 0;
    double resultado = 0;
    private List<Double> lista;

    public DesvioPadrao(List<Double> list){
        this.lista = list;
    }


    public double calculaDesvioPadrao(){
        somatario = 0;
        for(int i = 0; i < lista.size(); i++){
            somatario += lista.get(i);
        }
        media = somatario / lista.size();
        System.out.println("media=" + media);
        resultado = 0;
        for(int j = 0; j < lista.size(); j++) {
            resultado += Math.pow(Math.abs(lista.get(j) - media),2);
        }

        return Math.sqrt(resultado / lista.size());
    }
}
