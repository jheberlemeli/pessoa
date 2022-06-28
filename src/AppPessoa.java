public class AppPessoa {
    public static void main(String[] args) {
        Pessoa julia = new Pessoa();
        Pessoa fabio = new Pessoa("fabio", 18, "2", 70, 1.70);
        Pessoa lucas = new Pessoa("lucas", 22, "3");

        System.out.println(fabio);
        fabio.calculaImc();
        fabio.ehMaiorIdade();
    }
}
