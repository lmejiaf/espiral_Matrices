
package espiral;

import java.util.Scanner;

public class Espiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite n");

        int x = 1, n = sc.nextInt();
        int[][] MatrizA = new int[n + 1][n + 1];// les sumo uno para evitar trabajar la posicion 0
        //recorre las paredes de la matriz, en forma de cuadritos cada vez mas pequeños
        for (int a = 1; a <= n; a++) {
            // rellena todas las paredes superiores 

            for (int i = a; i <= n - a; i++) {
                MatrizA[a][i] = x;
                System.out.println("a la posicion: " + a + ", " + i + " le asigno " + x);
                x++;

            }

            //impresion
            for (int l = 1; l <= n; l++) {
                for (int f = 1; f <= n; f++) {
                    System.out.print("\t" + MatrizA[l][f]);
                    //    \t significa tabulador
                }
                System.out.println();
            }

            System.out.println("descripcion de lo que se hizo:------");
            System.out.println("- Se mantuvo la fila fija y se recorrio hasta la penultima columna ");
            System.out.println("fin primer ciclo");

            //.... paredes derechas
            for (int i = a; i <= n - a; i++) {
                MatrizA[i][n - a + 1] = x;
                System.out.println("a la posicion: " + i + ", " + (n - a + 1) + " le asigno " + x);

                x++;

            }
            //impresion
            for (int l = 1; l <= n; l++) {
                for (int f = 1; f <= n; f++) {
                    System.out.print("\t" + MatrizA[l][f]);
                    //    \t significa tabulador
                }
                System.out.println();
            }
            System.out.println("descripcion de lo que se hizo:------");
            System.out.println("- Se mantuvo la columna derecha (la ultima) fija y se recorrio hasta la penultima fila ");

            System.out.println("fin segundo ciclo");
//            //... paredes inferiores
            for (int i = n - a + 1; i >= a + 1; i--) {
                MatrizA[n - a + 1][i] = x;
                System.out.println("a la posicion: " + (n - a + 1) + ", " + (i) + " le asigno " + x);

                x++;
            }
            //impresion
            for (int l = 1; l <= n; l++) {
                for (int f = 1; f <= n; f++) {
                    System.out.print("\t" + MatrizA[l][f]);
                    //    \t significa tabulador
                }
                System.out.println();
            }
            System.out.println("descripcion de lo que se hizo:------");
            System.out.println("- Se mantuvo la fila de abajo (la ultima) fija y se recorrio hasta la segunda columna, aqui el recorrido va con paso i--  de derecha a izquierda");
            System.out.println("fin tercer ciclo");

            //.... pared lateral izquierda
            for (int i = n - a + 1; i >= a + 1; i--) {
                MatrizA[i][a] = x;
                System.out.println("a la posicion: " + i + ", " + a + " le asigno " + x);
                x++;
            }

            //impresion
            for (int l = 1; l <= n; l++) {
                for (int f = 1; f <= n; f++) {
                    System.out.print("\t" + MatrizA[l][f]);
                    //    \t significa tabulador
                }
                System.out.println();
            }

            System.out.println("descripcion de lo que se hizo:------");
            System.out.println("- Se mantuvo la columna de la izquierda(la primera) fija y se recorrio hasta la segunda fila, aqui el recorrido va con paso i-- de abajo hacia arriba ");

            System.out.println("fin cuarto ciclo");

            System.out.println("--------------------------------------------------------------------------");
            System.out.println("descripcion general: ");
            System.out.println("FIN DEL " + a + " CUADRO");
            if ((n - a - 1) >= 0) {
                System.out.println(" ahora se reducen los limites...");

                System.out.println("mi limite era: " + (n - a) + " y ahora su valor sera: " + (n - a - 1));
            } else {
                System.out.println("hemos acabado");
            }

            System.out.println("--------------------------------------------------------------------------");

        }
        System.out.println("fin ciclo grande");

        //si el ultimo dato pej: si n es 7, el ultimo dato se 49, se asigna en la posicion central de la matriz
        if (n % 2 == 1) {
            MatrizA[n / 2 + 1][n / 2 + 1] = x;
            System.out.println("asignacion del ultimo dato, el dato central en la posicion: " + (n / 2 + 1) + ", " + (n / 2 + 1));
        }
        // aqui muestro la matriz generada
        System.out.println("Matriz Finalizada: ");

        //impresion
        for (int l = 1; l <= n; l++) {
            for (int f = 1; f <= n; f++) {
                System.out.print("\t" + MatrizA[l][f]);
                //    \t significa tabulador
            }
            System.out.println();
        }

    }
}

//    public static void mostrarMatriz(int[][] MatrizA, int n) {
//        //impresion
//        for (int l = 1; l <= n; l++) {
//            for (int f = 1; f <= n; f++) {
//                System.out.print("\t" + MatrizA[l][f]);
//                //    \t significa tabulador
//            }
//            System.out.println();
//        }

