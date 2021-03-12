package practice;

import java.util.Scanner;

public class LaunchSpin {
	   
	public static void main(String args[]){
		boolean play = true;
    	Gen2 x = new Gen2();
    	Scanner scan = new Scanner(System.in);
       while(play){

            x.spin();
            System.out.println("Choose now. [y/n]");
            String n = scan.nextLine();
            play = n.contains ("y");

        }
        System.out.println("You spun " + x.spins + " times. Your total reward is " + x.total + ".  Thank you for playing.");
        return;
}}
