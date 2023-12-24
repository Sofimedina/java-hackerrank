package org.skm.Numbers;
import java.io.*;
import java.math.BigInteger;

import static java.util.stream.Collectors.joining;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger bigInteger=new BigInteger(n);

        if (bigInteger.isProbablePrime(0)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }


        bufferedReader.close();
    }
}
