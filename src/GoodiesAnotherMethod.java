import java.util.Arrays;
import java.util.Scanner;

public class GoodiesAnotherMethod {

	public static void main(String[] args) {
	
		    	/*Taken Input*/
		    	
		        int price[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
		        
		        String goodies[]={ "MI Band: 999",
		        		"Sandwich Toaster: 2195" ,
		        		"Cult Pass: 2799",
		        		"Scale: 4999",
		        		"Fitbit Plus: 7980",
		        		"Microwave Oven: 9800",
		        		"Alexa: 9999",
		        		"Digital Camera: 11101", 
		        		"IPods: 22349",
		        		"Macbook Pro: 229900" };
		        
		        int N = price.length;
		        
		        /* Using Scanner Class*/
		        
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the number of employees : ");
		        
		        int num =scan.nextInt();
		        
		        int ans=minDiff(price, N, num);
		        
		        System.out.println("Number of the employees : "+ num);
		        
		        System.out.println();
		        
		        int startindex=findelements(ans,price,N,num);
		        
		        System.out.println("Here the goodies that are selected for distribution are : ");
		        
		        for(int i=startindex;i<startindex+ num;i++) {
		        	 System.out.println(goodies[i]);
		        }
		        
		        System.out.println();
		        
		        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is : "+ ans);
		    }
		    
		    static int minDiff(int price[], int N, int num)
		    {
		    	/* Using Math Class*/
		    	
		    	
		        int result = Integer.MAX_VALUE;
		        
		        Arrays.sort(price);
		        
		        for (int i=0; i<= N-num;i++)
		            result = Math.min(result, price[i + num - 1] - price[i]);
		        return result;
		    }

		    static int findelements(int res,int price[], int N, int num)
		    {
		        int result = Integer.MAX_VALUE;
		        
		        for(int i=0; i<=N; i++)
		        {
		            result = Math.min(result, price[i + num - 1] - price[i]);
		            if (res==result)
		                return i;
		        }
		        return 0;
		    }
		}

