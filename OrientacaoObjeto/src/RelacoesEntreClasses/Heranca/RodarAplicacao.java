package RelacoesEntreClasses.Heranca;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast - Explícito - Deve ser evitado
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
