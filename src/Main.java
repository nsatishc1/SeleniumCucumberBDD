//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int num = 18, counter = 0;
    for(int iter=2;iter<num/2;iter++){
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