public class Pessoa {
    String nome;
    Integer idade;
    String ID;
    Integer peso;
    Double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, Integer idade, String ID, Integer peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void calculaImc(){
        Double imc = altura / (peso*peso);
        if (imc <= 20){
            System.out.println("-1");
        }
        if ( imc > 20 && imc < 25){
            System.out.println("0");
        }
        if (imc > 25){
            System.out.println("1");
        }
    }

    public boolean ehMaiorIdade(){
        if (idade >= 18){
            System.out.println("É maior de idade");
            return true;
        }else {
            System.out.println("Não é maior de idade");
            return false;
        }
    }
}
