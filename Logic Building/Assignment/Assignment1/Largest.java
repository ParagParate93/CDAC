class Largest{
             public static void main (String args[]){
             int n1 = 100;
             int n2 = 500;
             int n3 = 991;
             if(n1>n2){
                       if(n1>n3){
                       System.out.println("Largest No is : " + n1);
                                }
                       else{
                       System.out.println("Largest No is : " + n3);
                           }
                      }
              else if(n2>n3){
                            System.out.println("Largest No is : " + n2);
                           }
              else{
                   System.out.println("Largest No is : " + n3);
                  }
}
}