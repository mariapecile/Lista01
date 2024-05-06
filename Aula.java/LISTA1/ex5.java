public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nValores trocados:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scanner.close();
    }
}