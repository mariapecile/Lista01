
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (A): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número (B): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("O maior número é A: " + a);
        } else if (b > a) {
            System.out.println("O maior número é B: " + b);
        } else {
            System.out.println("A sequência de números informados é inválida, ambos são iguais.");
        }

        scanner.close();
    }
}