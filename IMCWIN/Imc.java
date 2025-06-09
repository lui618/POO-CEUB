// Imc.java
// Classe que faz o cálculo e a análise do IMC de um objeto Pessoa
public class Imc {
    /** Peso usado no cálculo de IMC */
    private final float pesoImc;
    /** Altura usada no cálculo de IMC */
    private final float alturaImc;
    /** Nome associado ao cálculo, para exibição */
    private final String nomeImc;
    /** Resultado do cálculo de IMC */
    private final float resultadoImc;

    /**
     * Construtor da classe Imc.
     *
     * @param peso   peso da pessoa em kg
     * @param altura altura da pessoa em metros
     * @param nome   nome da pessoa para exibição
     */
    public Imc(float peso, float altura, String nome) {
        this.pesoImc      = peso;                 // atribui peso ao campo interno
        this.alturaImc    = altura;               // atribui altura ao campo interno
        this.nomeImc      = nome;                 // atribui nome ao campo interno
        this.resultadoImc = calcularImc();        // dispara cálculo de IMC e armazena resultado
    }

    /**
     * Calcula o IMC dividindo o peso pelo quadrado da altura.
     *
     * @return valor do IMC calculado
     */
    private float calcularImc() {
        // peso / (altura * altura)
        return pesoImc / (alturaImc * alturaImc);
    }

    /*
       Método para analisar o valor do IMC e retornar uma classificação
       O método analisarImc() é privado para manter encapsulamento.
    */
    private String analisarImc() {
        // Verifica as faixas de IMC e retorna a classificação adequada
        if (resultadoImc < 18.5) {
            return "BAIXO DO PESO - É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas e riscos associados.";
        } else if (resultadoImc <= 24.9) {
            return "PESO ADEQUADO - Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal.";
        } else if (resultadoImc <= 29.9) {
            return "SOBREPESO - sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.";
        } else if (resultadoImc <= 34.9) {
            return "OBESIDADE GRAU I - É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.";
        } else if (resultadoImc <= 39.9) {
            return "OBESIDADE GRAU II - Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.";
        } else {
            return "OBESIDADE GRAU III - Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.";
        }
    }

    /**
     * Getter para o resultado do IMC.
     *
     * @return valor calculado do IMC
     */
    public float getResultadoImc() {
        return resultadoImc;  // devolve o IMC calculado
    }

    /**
     * Getter para a análise do IMC.
     *
     * @return texto com a classificação e recomendações
     */
    public String getAnaliseImc() {
        return analisarImc();  // chama o método privado de análise
    }

    /**
     * Getter para o nome associado ao cálculo.
     *
     * @return nome da pessoa usada no cálculo
     */
    public String getNomeImc() {
        return nomeImc;  // devolve o nome armazenado
    }

    /**
     * Getter para a altura usada no cálculo.
     *
     * @return altura da pessoa em metros
     */
    public float getAlturaImc() {
        return alturaImc;  // devolve a altura armazenada
    }
}
