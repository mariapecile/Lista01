public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double rendimentoCarro = 12.0;

        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagemHoras = scanner.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMediaKmh = scanner.nextDouble();

        double distanciaTotalKm = tempoViagemHoras * velocidadeMediaKmh;

        double litrosConsumidos = distanciaTotalKm / rendimentoCarro;

        System.out.println("Quantidade de litros de combustível gasta na viagem: " + litrosConsumidos);

        scanner.close();
    }
}