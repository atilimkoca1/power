import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        System.out.println("4 ün kuvvetleri:");
        for (int i=1; i<=k;i*=4 ){
            System.out.print(i+" ");
        }
        System.out.println("\n5 ün kuvvetleri:");
        for (int i=1; i<=k;i*=5 ){
            System.out.print(i+" ");
        }
    }
}
