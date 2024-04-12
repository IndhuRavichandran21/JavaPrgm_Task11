package task11;


public class IndexOutOfBoundExcep {
static String name="Abhinav";
    public static void main(String[] args) {
        
        try {
            int []arr=new int[3];
            arr[3]=5;
            
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
         }
      
    try {
        System.out.println(name.charAt(10));
        
    } catch (StringIndexOutOfBoundsException e) {
       System.out.println(e);
    }
    catch (Exception e) {
        System.out.println(e);
     }
     
    }
}
