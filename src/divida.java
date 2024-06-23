public class divida {
    public double calcularDividaExponencial(){
        //variavel local de metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0; //começando a variavel
        for(int x=1; x<=5; x++) {

            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;

        }
        //escopo de fluxo
        // e valorCalculado nunca estarao
        return valorMontante;
    }
}
