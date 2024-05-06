
public class VerificaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");

            if (a > b) {
                System.out.println("O número A é o maior.");
            } else {
                System.out.println("O número B é o maior.");
            }
        }

        scanner.close();
    }
}