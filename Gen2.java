package practice;

public class Gen2 {
    int spins;
    int total;
    boolean play;


    public Gen2(){
        spins = 0;
        total = 0;    
    }
    
    int spin(){
        int reward = 0;
        int s1 = (int)(Math.random()*10);
        int s2 = (int)(Math.random()*10);
        int s3 = (int)(Math.random()*10);

        if(s1 == s2 & s2 == s3) reward = 1000;
        else if(s1 == s2) reward = 25;
        else if(s1 == s3) reward = 25;
        else if(s3 == s2) reward = 25;
        else reward = -15;

        spins ++;
        
        total += reward;

        System.out.println( s1 + " " + s2 + " " + s3);
        if( reward < 0) System.out.println("Congradulations! You lost " + (-reward) +" dollars!!" );
        else System.out.println("Congradulations! You won " + reward + " dollars!!");
        System.out.println("Play again to earn more??");
        
        return reward;
    }

    

  
}



