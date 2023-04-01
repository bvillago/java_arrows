import java.util.Scanner; 
public class Arrows {
   public static void main(String[] args) {
      try (Scanner type = new Scanner(System.in)) {
        int arrowBaseHeight;
          int arrowBaseWidth;
          int arrowHeadWidth;
          
          System.out.println("Enter arrow base height:");
          arrowBaseHeight = type.nextInt();
          
          System.out.println("Enter arrow base width:");
          arrowBaseWidth = type.nextInt();
          
          System.out.println("Enter arrow head width:");
          arrowHeadWidth = type.nextInt();
         // System.out.println("");
          
          while (arrowHeadWidth <= arrowBaseWidth){
             System.out.println("Enter arrow head width:");  
              arrowHeadWidth = type.nextInt();
          }
          
          for (int i = 0; i < arrowBaseHeight; i++){
              for (int x = 0; x < arrowBaseWidth; x++){
                  System.out.print("*");
              } 
                System.out.println();
          }
          for (int i = arrowHeadWidth; i > 0; i--){
              for (int x = 0; x < i; x++){
                  System.out.print("*");
              }
               System.out.println();
          }
    }
    
      /******** This is from the original program, it's a comment now.
      Draw arrow base (height = 3, width = 2)
      System.out.println("**");
      System.out.println("**");
      System.out.println("**");
      
       Draw arrow head (width = 4)
      System.out.println("****");
      System.out.println("***");
      System.out.println("**");
      System.out.println("*"); 
      ****************************/
   }
}
