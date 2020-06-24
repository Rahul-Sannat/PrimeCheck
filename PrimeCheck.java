/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class PrimeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n,c=0;
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        for (i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
        {
            System.out.println(n+"is a prime number");
        }
        else
        {
            System.out.println(n+"is not a prime number");
        }
        }
    }
