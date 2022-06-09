import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        while(i<n){
            if(n%i==0){
                System.out.print("No");
                return;
            }
            i++;
        }
        System.out.print("Yes");
    }
}
