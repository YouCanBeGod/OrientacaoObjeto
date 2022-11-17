package RelacoesEntreClasses.PolimorfismoXSobrescrita;

public class ClassFilha2 extends ClassMae {

    @Override
    void metodo1() {
        System.out.println("Método 1 da Classe Filha 2");
    }

    @Override
    void metodo2() {
        System.out.println("Método 2 da Classe Filha 2");
    }
}
