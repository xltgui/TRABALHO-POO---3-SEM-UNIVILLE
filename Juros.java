public class Juros {
    private double mes;
    private double valor;
    private double percentual;

    public Juros(double valor, double mes, double percentual) {
        this.valor = valor;
        this.mes = mes;
        this.percentual = percentual;
    }

    public double jurosComposto(){
        double jurosCalculado = 0;
        percentual = percentual / 100;

        jurosCalculado = valor * Math.pow((1 + percentual),mes);
        jurosCalculado = jurosCalculado - valor;
        return jurosCalculado;
    }

}
