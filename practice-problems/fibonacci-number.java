class Main{
    public static void main(String[] args){
        int end=10;
        int first=0;
        int second=1;

        for(int i=0;i<end;i++){
            System.out.print(first+", ");

            int next = first+second;
            first=second;
            second=next;

        }

    }
}