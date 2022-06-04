import java.util.Scanner;
/**
 * SysBus
 * Authors: Nicolas Battisti & Fernando Sano
 */
public class SysBus {

    public static void main(String[] args) {
        int option = 0;
        int[] bus = new int[48];

        Scanner sc = new Scanner(System.in);
        // TODO: carregar os arquivos se existirem
        
        do {
            System.out.println("\n\n\t\tMenu:\n" + 
            "---------------------------------\n" + 
            "[1] Reservar assento.\n" + 
            "[2] Vender assento.\n" + 
            "[3] Alterar assento.\n"+ 
            "[4] Retirar poltrona da reserva.\n" +
            "[5] Imprimir.\n" + 
            "[0] Sair.\n\n");
            System.out.println("Digite uma opção: ");
            option = sc.nextInt();
            if(option >= 0 && option <= 5){
                Library.menu(option, bus);
            } else {
                System.out.println("Opção inválida");
            }
        } while ( option != 0);

        sc.close();
    }
}