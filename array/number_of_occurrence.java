class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int c=0,i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                c++;
            }
        }
        return c;
    }
}
