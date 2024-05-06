public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o operador aritmético (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':

                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");

                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operador não definido!");

                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}