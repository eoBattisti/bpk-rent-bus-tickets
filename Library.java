public class Library {

    public static void menu(int option, int[] bus){
      switch (option) {
          case 1:
              rentTicket(bus);
              break;
          case 2:
              sellTicket(bus);
              break;
          case 3:
              alterSeat(bus);
              break;
          case 4:
              cancelTicket(bus);
              break;
          case 5:
              showSeats(bus);
              break;
          default:
              break;
      }
    }
    
    public static void showSeats(int[] bus){
        System.out.println("Aqui mostrará um ônibus");
    }

    public static void rentTicket(int[] bus){
        System.out.println("Ticket reservado!");
    }

    public static void sellTicket(int[] bus){
        System.out.println("Ticket vendido!");
    }

    public static void alterSeat(int[] bus){
        System.out.println("Assento trocado!");
    }

    public static void cancelTicket(int[] bus){
        System.out.println("Ticket Cancelado!");
    }

    public static void saveFile(int[] bus){
        System.out.println("Arquivo salvo!");
    }

    public static int[] loadFile(){
        int[] aux = new int[48];
        System.out.println("Arquivo carregado!");
        return aux;
    }
}
