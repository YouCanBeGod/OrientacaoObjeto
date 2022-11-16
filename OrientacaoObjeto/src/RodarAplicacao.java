public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Uno", "Preto", 45);
        double valor1 = carro1.valorEncherTanque(4.58);
        double valor2 = carro1.valorEncherTanque(4.58, 10);

        System.out.println(carro1.getModelo() + ", " +  carro1.getCor() + ", " + carro1.getCapacidadeTanque() );
        System.out.printf("Valor para encher o tanque = R$%.2f, se aplicado desconto fica R$%.2f.", valor1, valor2);
    }
}
