import java.util.Scanner;

public class SaqueBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();
        double totalSaques = 0;

        for (int i = 1; i < totalSaques ; i++) {
          System.out.println("Saque realizado. Limite restante :"+limiteDiario+"\nTransacoes encerradas.");
          double valorSaque = scanner.nextDouble();

        if (totalSaques + valorSaque > limiteDiario) {
          System.out.println("Limite diario de saque atingido. Transacoes\n encerradas..");
          break; 
      } else {
                
            totalSaques += valorSaque;
            System.out.println("Saque realizado. Limite restante :"+limiteDiario+"\nTransacoes encerradas.");
        }
    }

        scanner.close();
  }
}