package driver;

import java.util.Scanner;
import model.*;

public class GhostCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ghost pocong = new Pocong();
        Ghost kuntilanak = new Kuntilanak();
        Ghost tuyul = new Tuyul();

        System.out.println("Select the ghost you want to know about (0: Pocong, 1: Kuntilanak, 2: Tuyul): ");
        int choice = scanner.nextInt();
        GhostType jenisHantu = null;

        switch (choice) {
            case 0:
                jenisHantu = GhostType.POCONG;
                break;
            case 1:
                jenisHantu = GhostType.KUNTILANAK;
                break;
            case 2:
                jenisHantu = GhostType.TUYUL;
                break;
            default:
                System.out.println("UNVALID!");
        }

        if (jenisHantu == GhostType.POCONG) {
            pocong.jelma();
            pocong.menghantui();
        } else if (jenisHantu == GhostType.KUNTILANAK) {
            kuntilanak.jelma();
            kuntilanak.menghantui();
        } else if (jenisHantu == GhostType.TUYUL) {
            tuyul.jelma();
            tuyul.menghantui();
        } else {
            System.out.println("UNVALID!");
        }

        scanner.close();
    }

    
}
