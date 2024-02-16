public class Principal {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("03264070");
        System.out.println(novoEndereco);

    }
}
