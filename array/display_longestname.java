class GFG {
    String longest(String names[], int n) {
        int max=0,index=0;
        for(int i=0;i<n;i++)
        {
            if(names[i].length()>max)
            {
                max=names[i].length();
                index=i;
            }
        }
        return names[index];
    }
}
