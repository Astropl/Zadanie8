import java.util.Scanner;

public class Zadanie8
    /*Zadanie 8. Napisać program pobierający od użytkownika dwie liczby
całkowite A oraz B, A < B, a następnie wyznaczający sumę ciągu
liczb od A do B, czyli sumę ciągu (A, A + 1, . . . , B). Obliczenia
należy wykonać trzykrotnie stosując kolejno pętle: while, do-while,
for.
Przykład:
Dla A = 4 i B = 11 program powinien wyświetlić:
60 60 60*/ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, a, b;
        while (i == 0) {
            System.out.println(" Podaj pierwsza liczbe calkowitą dodatnią A :");
            a = sc.nextInt();
            System.out.println(" Podaj drugą liczbe calkowitą dodatnią B :");
            b = sc.nextInt();

            if (a > b) {
                i++;
                System.out.println(" Liczba B musi byc wieksze od A\n");
                i = 0;
            } else {
                i = 1;
            }


            //suma ciagu od A do B ?

    /*for(int i=0; i<10; i++){
          System.out.println("To jest pętla");
      }*/
            int c = 0, d = 0;
            //c = a;

            for (i = a; i <= b; i++) {
                c = c + i;
                System.out.println(" suma for = " + c);
            }

            // teraz while
            c = 0;
            i = a;

            while (i <= b) {
                c = c + i;
                System.out.println(" suma while = " + c);
                i++;
            }
            // teraz do while
            c = 0;
            i = a;
            do {
                c = c + i;
                System.out.println(" suma while do = " + c);
                i++;
            }
            while (i <= b);

        }

        {

        }
    }
}
