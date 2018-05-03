package ua.ithillel.dnipro;

import java.util.HashMap;


/**
 * Hello world!
 *
 */
public class App
{
    double volume (int a, int b, int c){
        return a * b * c;
    }

    double volume (int a){
        return Math.pow(a, 3);
    }

    public static void main(String[] args )
    {
//        System.out.println( "Hello World!" );
       App app = new App();
    }
}
