 // Given {2, 5, 5, 2, 3, 3, 2}, find and print any one element that appears more than once (first repeated value found,
 //  using nested loops — for each element, check if it matches any earlier element).
 
 class Main {
    public static void main(String[] args){
        int[] arr = {2,5,5,2,3,3,2,7,8};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Repeated Element: "+arr[i]);
                    return; // rule to remember break stops the closest loop and return stops the current function/method meaning
                    //  first i did was break and it printed all the repeated elements but i intended to stop the loop after the
                    //  first repeadted value because break stopped the j loop and i loop was still running and when i increament
                    //  new condition was establised so bu default new j condition establised too so the loop did not stop until
                    //  it gave me all the repeated values
                }
            }
        }

    }
    
}
