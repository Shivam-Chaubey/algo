package patterns;

public class Pattern_20_Symmetric_Butterfly {
    private static void symmetricButterfly(int n){
        //upper half
        for(int i = 1; i <= n; i++){
            // for stars
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            // for space
            for(int j = 0; j < 2*(n-i); j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i = 1; i < n; i++){
            // for stars
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            // for spaces
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        symmetricButterfly(6);
    }
}

/*
 n=3
 
 *----*
 **--**
 ******
 **--**
 *----*

 n=5
 *--------*
 **------**
 ***----***
 ****--****
 **********
 ****--****
 ***----***
 **------**
 *--------*
 */