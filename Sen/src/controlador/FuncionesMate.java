package controlador;

/*
 In this part of the software ( Controlador) methods are defined and also is the side where the Logic is properly set up.


 */

import java.util.Scanner;

public class FuncionesMate {

    public double pi;
    Scanner leer = new Scanner(System.in);

    public FuncionesMate() {
        pi = 3.14159265358979323846;  /*PI number is approximately defined */
    }

    public int Factorial(int number) { /*Factorial Method our task is to multiply the variable result with all natural numbers from 1 to n. For this purpose, we use a for loop with a counter i that ranges from 1 to n. Within the loop, the existing value of result will be multiplied with the loop counter.*/
        int fact;
        int resp = 1;
        if ((number == 0) || (number == 1)) {
            fact = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                resp *= i;
            }
        }
        fact = resp;
        return fact;
    }

    public double Potencia(double number, int exp) { /* This method is used to calculate a number raise to the power of some other number. This function accepts two parameters and returns the value of first parameter raised to the second parameter */
        double pot = number;
        if (exp == 0) {
            pot = 1;
        } else if (exp > 0) {
            for (int i = 1; i < exp; i++) {
                pot *= number;
            }
        } else if (exp < 0) {
            for (int i = 1; i < exp; i++) {
                pot *= number;
            }
            pot = 1 / pot;
        }
        return pot;
    }

    public double GradosRadianes(int grados) {
        double radianes = grados * pi / 180; /* valude of PI in degrees */
        return radianes; /* valude of PI in degrees */
    }

    public int signo(int exp) { /* This method changes the sign of a number whose value has been provided by the user */
        if (exp % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
