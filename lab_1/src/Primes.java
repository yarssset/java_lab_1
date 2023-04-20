import java.util.Scanner;
public class Primes { // класс "простые числа"
    public static void main(String[] args) { // точка входа
        // перебор от 2 до 100
        for (int i=2; i<101; i++){
            if (isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int n) { // функция проверяет простое ли число
        for (int i=2; i<n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

}


  //  Scanner sc = new Scanner(System.in);
   //     System.out.print("Введите число: ");
     //           int n = sc.nextInt();
       //         sc.close();