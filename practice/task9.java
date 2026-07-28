// Print a right-angled triangle pattern of stars, 5 rows tall:
// *
// **
// ***
// ****
// *****

class Main{
    public static void main(String[] args){
        for(int i = 0; i<5;i++){ // this represents the outer loop
            for(int j = 1;j<=i+1;j++){ // how many number of starts to print
                System.out.print("*");
            }
            System.out.println(); 
        }

    }
}