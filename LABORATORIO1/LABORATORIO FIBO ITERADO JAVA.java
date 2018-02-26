package fiboiterado;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class FiboIterado {
    
    public static int fibIint(int numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            int a = 0;
            int b = 1;
            for (int i = 1; 1 < numero; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }  
    }
    static byte fibIbyte(byte numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            byte a = 0;
            byte b = 1;
            for (byte i = 1; 1 < numero; i++) {
                byte c = (byte)(a + b);
                a = b;
                b = c;
            }
            return b;
        }  
    }
    public static short fibIshort(short numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            short a = 0;
            short b = 1;
            short c;
            for (short i = 1; 1 < numero; i++) {
                c = (short)(a + b);
                a = b;
                b = c;
            }
            return b;
        }  
    }
    public static long fibIlong(long numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            long a = 0;
            long b = 1;
            long c;
            for (long i = 1; 1 < numero; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }  
    }
    public static BigInteger fibIbigint(BigInteger numero){
        if ( numero.equals(BigInteger.ZERO)) { 
            return BigInteger.ZERO;
        }
        else{
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ZERO;
            BigInteger c = BigInteger.ZERO;
            for (BigInteger i = BigInteger.valueOf(1); i.compareTo(numero)< 0; i.add(BigInteger.ONE)) {
                c = a.add(b);
                a = b;
                b = c;
            }
            return b;
        }  
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte numerob = sc.nextByte();
        short numeros = sc.nextShort();
        int numeroi = sc.nextInt();
        long numerol = sc.nextLong();
        BigInteger numerobi = sc.nextBigInteger();
        System.out.println(fibIbyte(numerob));
        System.out.println("Siendo " + numeros + " un tipo de dato Short, El valor que le corresponde a Fibonacci de (" + numeros + ") es: " + fibIshort(numeros));
        System.out.println("Siendo " + numeroi + " un tipo de dato Int, El valor que le corresponde a Fibonacci de (" + numeroi + ") es: " + fibIint(numeroi));
        System.out.println("Siendo " + numerol + " un tipo de dato Long, El valor que le corresponde a Fibonacci de (" + numerol + ") es: " + fibIlong(numerol));
        System.out.println("Siendo " + numerobi + " un tipo de dato BigInteger, El valor que le corresponde a Fibonacci de (" + numerobi + ") es: " + fibIbigint(numerobi));
    }
}
