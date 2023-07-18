import java.util.Scanner;

public class ModArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(caculateAmodB(A,B,n));
    }
    public static int caculateAmodB(int A[],int B,int n)
    {
        int ans = 0,power = 1;
        for(int i=n-1;i>=0;i--)
        {
            ans = (ans + (A[i]%B) * power) % B;
            power=(power * 10) % B;
        }
        return ans;
    }
}
/*
Mod Array
You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.

Example Input
Input 1:
A = [1, 4, 3] B = 2
Input 2:
A = [4, 3, 5, 3, 5, 3, 2, 1] B = 47

Example Output
Output 1:
1
Output 2:

20
 */