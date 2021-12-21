class Compute {
    
    public void rotate(int arr[], int n)
    {
        int i;
        int temp=arr[n-1];
        for(i=n-1;i>=0;i--)
        {
            if(i==0)
            {
                arr[0]=temp;
            }
            else
            {
                arr[i]=arr[i-1];
            }
        }
        
    }
}
