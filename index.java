import java.util.Scanner;

public class index {
    
    public static int saldoDeRanqueadas(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vitorias, derrotas;
        char saida = 's';
        
        while (saida == 's') {
            System.out.print("\nInforme o número de vitórias: ");
            vitorias = scanner.nextInt();
            System.out.print("Informe o número de derrotas: ");
            derrotas = scanner.nextInt();
            
            int saldo = saldoDeRanqueadas(vitorias, derrotas);
            if (saldo <= 10) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Ferro");
            } else if (saldo >= 11 && saldo <= 20) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Bronze");
            } else if (saldo >= 21 && saldo <= 50) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Prata");
            } else if (saldo >= 51 && saldo <= 80) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Ouro");
            } else if (saldo >= 81 && saldo <= 90) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Diamante");
            } else if (saldo >= 91 && saldo <= 100) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Lendário");
            } else if (saldo >= 101) {
                System.out.println("O herói tem o saldo de " + saldo + " vitórias, está no nível de Imortal");
            }
            
            System.out.print("\nDeseja continuar? (s/n): ");
            saida = scanner.next().charAt(0);
            while (saida != 's' && saida != 'n') {
                System.out.print("Digite 's' ou 'n'.\nDeseja continuar? (s/n): ");
                saida = scanner.next().charAt(0);
            }
        }
        scanner.close();
    }
}
