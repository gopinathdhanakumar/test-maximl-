import java.util.*; 
public class  Main
{ 
     
    public static void main(String args[]) 
    { 
        HashMap<Integer,String> kali=new HashMap<>();
        String s=new String();
        Scanner s1=new Scanner(System.in);
        s=s1.next();
        Integer n=s.length();
        for (int i=0;i<n;i++)
        {
            String d=""+s.charAt(i);
            for(int j=i+1;j<n;j++)
            {
                int ct=0;
                for(int k=0;k<d.length();k++)
                {
               // System.out.println(d);
                    if(d.charAt(k)==s.charAt(j))
                    {
                        ct=1;
                        break;
                    }
                
                }
                if(ct==0)
                {
                    d=d+s.charAt(j);
                }
                if( ct==1)
                {
                     //System.out.println("put"+d);
                    kali.put(d.length(),d);
                    break;
                }
            }
            kali.put(d.length(),d);
        }
        
        System.out.println(kali.get(kali.size()).length());
        
	}
}
