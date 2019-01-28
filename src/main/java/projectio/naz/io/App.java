package projectio.naz.io;

/**
 * Hello world!
 *
 */
public class App 
{
	public int max_freq() {
		int array1[]= {1,1,1,2,3};
	    int maxx_freq=0;
	    int[] freq_count=new int[10000];
	    for(int i=0;i<freq_count.length;i++)
	    {
	    	freq_count[i]=0;
	    }
	    for(int i=0;i<array1.length;i++)
	    {
	    	freq_count[array1[i]]=freq_count[array1[i]]+1;
	    }
	    for(int i=0;i<freq_count.length;i++)
	    {
	    	if(freq_count[i]>maxx_freq)
	    	{
	    		maxx_freq=freq_count[i];
	    	}
	    	else
	    	{
	    		maxx_freq=maxx_freq;
	    	}
	    }
	    return maxx_freq;
	}
	
	
	public int min_freq() {
		int array1[]= {1,1,1,2,3};
	    int min_freq=10000000;
	    int[] freq_count=new int[10000];
	    for(int i=0;i<freq_count.length;i++)
	    {
	    	freq_count[i]=0;
	    }
	    for(int i=0;i<array1.length;i++)
	    {
	    	freq_count[array1[i]]=freq_count[array1[i]]+1;
	    }
	    for(int i=0;i<freq_count.length;i++)
	    {
	    	if(freq_count[i]<min_freq && freq_count[i]!=0)
	    	{
	    		min_freq=freq_count[i];
	    	}
	    	else
	    	{
	    		min_freq=min_freq;
	    	}
	    }
	    return min_freq;
	}
	    
}
