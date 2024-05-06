public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite os três números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        if (numero2 > numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;

            if (numero1 > numero2) {
                int temp2 = numero1;
                numero1 = numero2;
                numero2 = temp2;
            }
        }

        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);

        scanner.close();
    }
}