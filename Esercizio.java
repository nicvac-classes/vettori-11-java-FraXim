//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        Random rand = new Random();
        int i, n, t, j;
        System.out.println("Inserisci da quante celle sono composti i vettori");
        n = in.nextInt();
        int[] u = new int[n]; 
        int[] r = new int[n];
        int[] s = new int[n];
        int[] m = new int[n];
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Inserisci " + i + 1 + "° numero positivo");
            do {
                u[i] = in.nextInt();
                if (u[i] >= 0) {
                } else {
                    System.out.println("Il numero deve essere positivo");
                }
            } while (u[i] < 0);
        }
        for (i = 0; i <= n - 1; i++) {
            r[i] = rand.nextInt(11);
            System.out.println((i + 1) + "° numero : " + r[i]);
        }
        for (i = 0; i <= n - 1; i++) {
            s[i] = 3 + rand.nextInt(6);
            System.out.println((i + 1) + "° numero : " + s[i]);
        }
        for (i = 0; i <= n - 1; i++) {
            m[i] = (s[i] + r[i] + u[i]) / 3;
            System.out.println((i + 1) + "° media fra i numeri " + r[i] + " + " + s[i] + " + " + u[i] + " = " + m[i]);
        }
        System.out.println("Inserisci un numero");
        t = in.nextInt();
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                if (u[i] + u[j] == t) {
                    System.out.println((u[i]) + " + " + u[j] + " = " + t);
                } else {
                    System.out.println("Nella cella" + (i + 1) + " non ci sono numeri che sommati danno come risultato " + t);
                }
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md