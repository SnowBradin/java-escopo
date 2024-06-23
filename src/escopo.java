public class escopo {
    //variavel de classe conta
    double saldo=10.0;

    public voide sacar(Double valor) {
        //variavel local de metodo
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        //disponivel em toda classe
        System.out.println(saldo);
        //somente o metodo sacar conhece essa variavel
        System.out.println(novoSaldo);
        //logo, aqui nao seria possivel o "novoSaldo"
    }
}
