package vista;

/*This software provides a user to run the Taylor Series which is an proximation of funtions via pow numbers. Please bare in mind that The more sums of polynomials the more approximate the value will be.
 * Java Version ( NetBeans 10.0)
 *
/* In this part of the software ( View Side) the menu allows the user to choose 2 options, 1 to run the software itelf and the other to finish it.
 *
 * Software developed by Diego Novoa
 */

import java.util.Scanner;
import controlador.FuncionesTrigo;
import modelo.info;
import controlador.FuncionesMate;

public class Menu {

    int grades = 0;      /*  Variable defined */
    int repetitions = 0;  /*  Variable defined */

    public void interfaz() {
        int opc;
        FuncionesMate fmatema = new FuncionesMate();
        FuncionesTrigo ftrigo = new FuncionesTrigo();
        info minfo = new info();

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("***Taylor Series***");
            System.out.println("Welcome to the Taylor Series software, please provide one of the following options:");
            System.out.println("1.Seno Functions\n7.Salir");
            opc = leer.nextInt();
            int datos = 0;
            switch (opc) {
                case 1:
                    System.out.print("Please enter the number of repetitions: ");
                    repetitions = leer.nextInt();
                    System.out.print("Please enter the grades that you would like the software to convert to: ");
                    grades = leer.nextInt();
                    minfo.datos(grades,repetitions);
                    System.out.println("The sine of  " + grades + "° is equal to : " + ftrigo.sin(grades, repetitions));
                    break;

            }
        } while (opc != 7);
        System.out.println(" Thanks for using the software , see you in another opportunity.");
    }
}
