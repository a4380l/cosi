import java.util.Scanner;
public class TestLogic{
   public static void main(String[] args){
    
     Scanner input = new Scanner(System.in);
     
     System.out.println("please enter your grade");
     double grade = (new Scanner(System.in)).nextDouble();
    
     
     if(grade >= 90){
       System.out.println("A");
    
     }
     if(grade <90){
       System.out.println("grade is not an A");
      }
      else{
        System.out.println("grade is an A");
       }
     if(grade >=90){
       System.out.println("A");
        }
     else if(grade >=80){
       System.out.println("B");
       }
     else if(grade >=70){
       System.out.println("C");
     }
     else {
       System.out.println("F");
       
         
       
       
       if(grade >=80){
       System.out.println("This is a good grade.");
        }
          if(grade >=90){
       System.out.println("WOW,you got an A");
       }
       
     }
     else if(grade < 80&& grade >=70){
       System.out.println("this grade is avenage.");
      
     }
     else{
       System.out.println("this is a bad grade");
     }
       
    
       
       
   }
   
}
}