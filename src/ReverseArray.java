import java.util.*;
class Solution{
    public void reverseArray(int size,int[] array)
    {
       int i=0,j=size-1;
       while(i<size/2)
       {
           int temp=array[i];
           array[i]=array[j];
           array[j]=temp;
           i++;
           j--;
       }
       for(int element:array)
       {
           System.out.print(element+" ");
       }
    }

}
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
        Solution solution=new Solution();
        solution.reverseArray(n,array);

    }
}
