public class Pessoa{
    private String nome;
    private double peso;
    private double altura;

    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Double calcularIMC(){
        return peso/(altura*2);
    }

   
    public String processarImc() {
        double imc = calcularIMC();
    
        if (imc < 18.5) {
            return "baixo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "peso adequado";
        } else if (imc >= 25 && imc <= 29.9) {
            return "sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "obesidade grau II";
        } else {
            return "obesidade grau III";
        }
    }
}     