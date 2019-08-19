import java.util.*;
	
class Main{ 
 
 final static int no_ch = 256;  
 static int max_diff(String str,int n) { 
     int totalString[] = new int[no_ch]; 

	
		for(int i=0;i<n;i++) { 
			totalString[str.charAt(i)]++; 
		} 

		int maxdif = 0; 
		for (int i = 0; i < no_ch; i++) { 
			if (totalString[i] != 0) { 
				maxdif++; 
			} 
		} 

		return maxdif; 
	} 

	static int test(String str) { 

		int n = str.length();	  
		int maxdif= max_diff(str, n); 
		int m = n; 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 
				String subs = null; 
				if(i<j) 
					subs = str.substring(i, j); 
				else
					subs = str.substring(j, i); 
				int subs_lenght = subs.length(); 
				int sub_distinct_char = max_diff(subs, subs_lenght); 

			
				if (subs_lenght < m && maxdif == sub_distinct_char) { 
					m = subs_lenght; 
				} 
			} 
		} 
		return m; 
	} 

public	static  void main(String[] args) {
    Scanner s=new Scanner(System.in);
	
		String str = s.next(); 

		int l = test(str); 
		System.out.println("Maxi length of distinct character substring length is  "+l); 
	} 

}
