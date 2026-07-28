// Given {5, 12, 8, 130, 44}, find and print the sum of only the even numbers.

class Main {
    public static void main(String[] args) {
        int[] arr = {5,12,8,130,144};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}