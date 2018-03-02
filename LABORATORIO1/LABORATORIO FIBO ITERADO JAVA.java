package fiboiterado;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class FiboIterado {
    
    static int fibIint(int numero){
        if ( numero == 0) { 
            return 0;
        }
        else{ 
            int a = 0;
            int b = 1;
            int c;
            for (int i = 1; i < numero; i++) {
                c = a + b;
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
            for (byte i = 1; i < numero; i++) {
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
            for (short i = 1; i < numero; i++) {
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
            for (long i = 1; i < numero; i++) {
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
            BigInteger b = BigInteger.ONE;
            for (BigInteger i = BigInteger.ONE; i.compareTo(numero)< 0;i = i.add(BigInteger.ONE)) {
                b = a.add(b);
                a = b.subtract(a);
            }
            return b;
        }  
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte numerob = 11;
        short numeros = 40;
        int numeroi = 46;
        long numerol = 134;
        BigInteger numerobi = sc.nextBigInteger(); //no tiene limite conocido
        System.out.println("despues de fib("+numerob+")="+fibIbyte(numerob)+" byte hacer overflow");
        System.out.println("despues de fib("+numeros+")="+fibIshort(numeros)+" short hacer overflow");
        System.out.println("despues de fib("+numeroi+")="+fibIint(numeroi)+" int hacer overflow");
        System.out.println("despues de fib("+numerol+")="+fibIlong(numerol)+" long hacer overflow");
        System.out.println("BI "+fibIbigint(numerobi));
    }
}
