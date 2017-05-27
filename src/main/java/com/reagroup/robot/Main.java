package com.reagroup.robot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Main class.
 * 
 * 
 *
 * @version $Rev$ $Date$
 */
public class Main {
    public static void main(String args[]) throws Exception {
    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Please enter command  eg: PLACE 0,0,NORTH (If you want to quit type 'exit') ");

        while (true) {
            System.out.println("\n $ >");
            String input = reader.readLine();

            if (input.equals("exit")) {
                return;
            }
            Robot.process(input);    
        }
    }
}
