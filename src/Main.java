import java.util.Scanner;
import java.lang.Math;

public class Main {

    /**
     *
     * @param message
     * @return
     */
    public static int requestNumberFromUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    } // METHOD REQUEST NUMBER FROM USER ENDS

    /**
     * Esta función valids que un numero dado se encuentre entre 5 y 300
     * @param number - parametro donde la función recibe el número que debe validar
     * @return true si el numero se encuentra dentro del rango y false si el numero no se encuentra dentro del rango
     */
    public static boolean numberIsValid(int number){
        return 5 <= number && number <= 300;
    } // FUNCTION NUMBER IS VALID ENDS

    /**
     *
     * @param number
     * @return
     */
    public static boolean isPrime(int number){
        int divisor = 2;
        int squareRootOfNumber = (int)Math.sqrt(number);
        boolean isPrime = true;
        while(divisor <= squareRootOfNumber && isPrime){
            if(number % divisor == 0){
                isPrime = false;
            } // IF
            divisor++;
        }
        return isPrime;
    } // METHOD IS PRIME ENDS

    /**
     *
     * @param isPrime
     * @param number
     * @return
     */
    public static String createMessageForNumber(boolean isPrime, int number){
        String message = "El numero: " + number;
        if(!isPrime){
            message += " NO";
        }
        message += " es un número primo";
        return message;
    } // METHOD CREATE MESSAGE FOR NUMBER ENDS

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int numberFromUser = requestNumberFromUser("Digite un número entre 5-300: ");
        if(numberIsValid(numberFromUser)){
            System.out.println(createMessageForNumber(isPrime(numberFromUser), numberFromUser));
        } // IF ENDS
        else{
            System.out.println("El número digitado no es válido");
        } // ELSE ENDS
    }  // METHOD MAIN ENDS
} // CLASS ENDS
