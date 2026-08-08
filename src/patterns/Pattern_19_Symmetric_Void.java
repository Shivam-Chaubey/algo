package patterns;

public class Pattern_19_Symmetric_Void {
    private static void symmetricVoid(int n){
        for(int row = 0; row < n; row++){
            // for star
            for(int i = 0; i < n-row; i++){
                System.out.print("*");
            }
            // for space
            for(int i = 0; i < 2*row; i++){
                System.out.print(" ");
            }
            // for star
            for(int i = 0; i < n-row; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1; row <= n; row++){
            // for star
            for(int i = 1; i <= row; i++){
                System.out.print("*");
            }
            //for space
            for(int i = 1; i <= 2*(n-row); i++){
                System.out.print(" ");
            }
            // for star
            // for star
            for(int i = 1; i <= row; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        symmetricVoid(3);
    }
}
/* 
n=3
******
**--**
*----*
*----*
**--**
******


n=5
**********
****  ****
***    ***
**      **
*        *
*      *
**    **
***  ***
********
**********
*/