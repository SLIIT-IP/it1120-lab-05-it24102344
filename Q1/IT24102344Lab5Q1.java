import java.util.Scanner;

public class IT24102344Lab5Q1 {
  public static void main(String[]args) {
    Scanner scanner=new Scanner(System.in);


     int count=0;
     int num;
     int smallest=Integer.MAX_VALUE;
     int largest=Integer.MIN_VALUE;

     do{
       System.out.println("Enter integer" +(count+1)+":");
       num=scanner.nextInt();

       if(num<smallest){
         smallest=num;
       }

       if(num>largest){
         largest=num;
       }
 
       count++;
      } while(count<3);
   
      System.out.println("The smallest number is:"+smallest);
      
      System.out.println("The largest number is:"+largest);

      scanner.close();
      
     }
   }


   



       



