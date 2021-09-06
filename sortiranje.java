import java.util.Scanner;


public class sortiranje {


    public static void main(String[] args) {

        /*  BUBBLE SORT NIZOVI */


        int[] niz;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj koliko clanova niza zelite");
        n = scanner.nextInt();
        niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            System.out.print("unesi elemente niza: ");
            niz[i] = scanner.nextInt();
        }

        for (int i = 0; i < niz.length - 1; i++) {
            for (int j = 0; j < niz.length - 1 - i; j++) {
                if (niz[j] > niz[j + 1]) {
                    int pomocna = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = pomocna;

                }
            }
        }
        System.out.println("Bubble Soritran niz je: ");
        for (int i = 0; i < niz.length; i++) {

            System.out.print("\t" + niz[i] + "");
        }


    }

}



