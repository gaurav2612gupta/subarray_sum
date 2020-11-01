package algorithms;
import java.util.*;

public class subarray_sum {
public static boolean check(int[]arr,int k){
    int sum=0;
    Set<Integer> s=new HashSet<Integer>();
    int n=arr.length;
    for (int i = 0; i < n; i++) {
        s.add(sum);
        sum+=arr[i];
        if (s.contains(sum-k)){
            return true;
        }
    }
    return false;
}
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,1,3,-4,-2};
        int k=-1;
        if (check(arr,k))
            System.out.println("True");
        else
            System.out.println("False");
    }
}


