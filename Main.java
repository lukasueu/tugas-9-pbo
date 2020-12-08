import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Anggrek anggrek = new Anggrek();
        Mawar mawar = new Mawar();
        Melati melati = new Melati();
        Scanner sc = new Scanner(System.in);
        int inp = 0;

        
        do {
            System.out.println("Masukkan: 0 untuk memberikan air, 1 untuk memberi pupuk, 999 untuk keluar");
            inp = sc.nextInt();

            switch (inp) {
                case 0: 
                    anggrek.beriAir();
                    mawar.beriAir();
                    melati.beriAir();
                    break;
                case 1: 
                    anggrek.beriPupuk();
                    mawar.beriPupuk();
                    melati.beriPupuk();
                    break;
                default:
                    break;
            }

            System.out.println(anggrek.jenis);
            anggrek.displayPlant();
            System.out.println(mawar.jenis);
            mawar.displayPlant();
            System.out.println(melati.jenis);
            melati.displayPlant();
        } while(inp != 999);
    }
}
