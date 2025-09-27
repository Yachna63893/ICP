package ICP.Day2;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = { 1,2,3,0,0,0};
        int m = 3;
		int[] arr2 = { 2,5,6 };
        int n = 3;
        int[] ans = Merge(arr1, m, arr2, n);
        for(int i=0; i<m+n; i++){
            arr1[i] = ans[i];
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] Merge(int[] arr1,int n, int[] arr2, int m){
        int[] ans = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
