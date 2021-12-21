class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
      long max=0,min=a[0];
      for(int i=0;i<n;i++)
      {
          if(a[i]>max)
          {
              max=a[i];
          }
          if(a[i]<min)
          {
              min=a[i];
          }
      }
      
      pair res=new pair(min,max);
        return res;
    }
}
