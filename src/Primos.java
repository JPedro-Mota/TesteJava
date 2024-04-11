import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                    break;

                }
            }

            if(primo){
                System.out.println(i + " É primo");
            }

        }
    }
}



