public class T03_ForInJava {
    public static void main(String[] args) {

        for(int i = 1; i < 11; i++){
            System.out.print(i);
        }

        System.out.println();

        for(int i = 10; i > 0; i--){
            System.out.print(i);
        }

        System.out.println();

        for(int i = 1; i < 10; i+=2){
            System.out.print(i);
        }

        System.out.println();

        int[]x = {1,2,3,4,5};
        for(int i : x){
            System.out.print(i);
        }

        System.out.println();
    }
}
