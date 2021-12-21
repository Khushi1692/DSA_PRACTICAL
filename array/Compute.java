class Compute {
    
    public int largest(int arr[], int n)
    {
        int i,max=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
