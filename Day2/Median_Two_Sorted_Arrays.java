package ICP.Day2;

public class Median_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(Merge(nums1, nums2));
    }
    public static double Merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length; 
        int[] ans = new int[n+m];
        int i=0,j=0,k=0;
        double med = 0;
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
        int len = ans.length;
        if(len%2==0){
            int f = len/2;
            int l = (len/2-1);
            med = (ans[f]+ans[l]) / 2.0;
        }else{
            int pos = (len)/2;
            med = ans[pos];
        }
        return med;
    }
}
