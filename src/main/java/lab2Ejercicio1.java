
public class lab2Ejercicio1 {
    public static void main(String []args){
        int j;
        int i;
        //(a)
        for (j=1;j<11;j++){
            for (i=1;i<=j;i++){
                System.out.print("*"); 
            }
            System.out.println();
        }
        //(b)
        for (j=1;j<11;j++){
            for (i=10;i>=j;i-- ){
                System.out.print("*"); 
            }
            System.out.println();
        }
        //(c)
        for(j=1;j<11;j++){
            for (i=1;i<j;i++){
                System.out.print(" ");
            }
            for (i=11-i;i>=1;i--){
                System.out.print("*");
            }
            System.out.println();
        }
        //(d)
         for(j=1;j<11;j++){
            for (i=10;i>j;i--){
                System.out.print(" ");
            }
            for (i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
