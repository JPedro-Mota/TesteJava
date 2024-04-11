import java.util.Scanner;
public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for( int i = 0; i < num; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }
            if( num % 2 == 0){
                System.out.println("O número é par");
            }
            else {
                System.out.println("O número é impar");
            }
    }
}
