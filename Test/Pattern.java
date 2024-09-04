//3

/* class Pattern{
	public static void main(String args []){
		char n = (char)65;
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<((i*2)/2)+i; j++){
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
} */


//4. done
 
/* class Pattern{
	public static void main(String args []){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				if(i==3 && j==2){
						System.out.print("  ");
						continue;
				}
				if((i==4 && j==2) || (i==4 && j==3)){
						System.out.print("  ");
						continue;
				}
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
} */


//5.

public class Pattern
{
    public static void main(String[] args) 
    {
        int i,j;        
        for(i=1;i<=5;i++)
        {
            
            for(j=i;j<=5;j++)
                System.out.print(" ");
            
            for(j=1;j<=i;j++)
                System.out.print(j+"");
            
            for(j=i-1;j>=1;j--)
                System.out.print(j+"");
            System.out.println();
         }
    }
}


	
	