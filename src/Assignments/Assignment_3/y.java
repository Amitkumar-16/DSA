package Assignments.Assignment_3;

public class y{
    static int sorting(int [] arr, int k , int j,int p) {
        if (p == arr.length  ){
            return 0;
        }
            if (arr[p] <= k) {
                int temp = arr[p];
                arr[p] = arr[j];
                arr[j] = temp;
                j++;
            }
            p++;
            return sorting(arr, k, j, p);

    }
    public static void main(String[] args) {
        int [] k = {2,3,4,8,6,3,2,12,14,1,2,3};
        System.out.println(sorting(k,3,0,0));
        for(int a : k){
            System.out.println(a);
        }
    }
}