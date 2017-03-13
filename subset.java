package ivtl;
import java.util.*;
public class subsetarray {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		// TODO Auto-generated method stub
     int e1=0,e2=0,i=0,j=0,c=0;
      e1=x.nextInt();
      e2=x.nextInt();
		int a1[]=new int[e1];
     int a2[]=new int[e2];
     for(i=0;i<e1;i++)
     {
    	 a1[i]=x.nextInt();
     }
     
     for(i=0;i<e2;i++)
     {
    	 a2[i]=x.nextInt();
     }
     for(i=0;i<e2;i++)
     {
    	 for(j=0;j<e1;j++)
    	 {
    		 if(a2[i]==a1[j])
    		 {
    			 c++;
    			
    		 }
    	 }
    	 
     }
     if(c==e2)
	 {
		System.out.println("yes"); 
	 }
	 else
	 {
		 System.out.println("no"); 
	 }
	}

}
