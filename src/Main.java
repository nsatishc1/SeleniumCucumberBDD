

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
    int num = 4, counter = 0;
    for(int iter=2;iter<=(sqrt(num));iter++){
        if(num%iter == 0){
            counter++;
            break;
        }

    }
        if(counter>0){
            System.out.println(num+" is not prime");
        }
        else{
            System.out.println(num+" is prime");
        }

    }
}