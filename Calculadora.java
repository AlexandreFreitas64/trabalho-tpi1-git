public class Calculadora {

    /**
     * Executa uma operação matemática básica.
<<<<<<< HEAD
     * @param operacao Tipo da operação: "soma", "subtracao", "multiplicacao", "divisao"
=======
     * @param operacao Tipo da operação: "soma"
>>>>>>> amissao
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return a + b;
<<<<<<< HEAD
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida!");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
=======
            
>>>>>>> amissao
        }
    }
    // Comentário do item 11
    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
<<<<<<< HEAD
        
        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
        System.out.println("Divisão: " + calc.calcular("divisao", 10, 5));
=======

        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
>>>>>>> amissao
    }
}

