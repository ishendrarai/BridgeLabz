import java.util.*;
public class PositiveNegativeEvenOddCompare {
    public static boolean isPositive(int n){ return n>=0; }
    public static boolean isEven(int n){ return n%2==0; }
    public static int compare(int a,int b){ if(a>b)return 1; if(a==b)return 0; return -1; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){ arr[i]=sc.nextInt(); }
        for(int n:arr){
            if(!isPositive(n)) System.out.println(n+":Negative");
            else{
                System.out.println(n+":"+(isEven(n)?"Even":"Odd"));
            }
        }
        int c=compare(arr[0],arr[4]);
        if(c==0)System.out.println("First and last are equal");
        else if(c>0)System.out.println("First is greater");
        else System.out.println("First is smaller");
        sc.close();
    }
}
