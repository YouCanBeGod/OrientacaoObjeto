package ConceitosRelacionais.PolimorfismoXSobrescrita;

public class RodarAplicacao {

    public static void main(String[] args) {

        ClassMae[] classes = new ClassMae[]{new ClassFilha1(), new ClassFilha2(), new ClassMae()};

        //Polimorfismo
        for (ClassMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClassMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        //Sobrescrita, onde se muda a implementação e usa diretamente a Classe Filha
        ClassFilha2 classFilha2 = new ClassFilha2();
        classFilha2.metodo2();
    }
}
