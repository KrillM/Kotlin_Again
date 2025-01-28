public class T08_FunctionInJava {

    // 매개 변수와 반환 값이 있는 메서드
    static String method1(String name){
        return "My name is "+name;
    }

    // 반환 값만 있는 메서드
    static int method2(){
        return 3*4;
    }

    // 매개 변수만 있는 메서드
    static void method3(String name, int num){
        System.out.println(name + " : "+ num);
    }

    // 결과만 출력하는 메서드
    static void method4(){
        System.out.println("Box Only");
    }

    public static void main(String[] args) {

        // 매개 변수와 반환 값이 있는 함수
        String name = method1("Rose");
        System.out.println(name);

        // 반환 값만 있는 함수
        int result = method2();
        System.out.println(result);

        // 매개 변수만 있는 함수
        method3("Mbappe", 7);

        // 결과만 출력하는 함수
        method4();
    }
}
