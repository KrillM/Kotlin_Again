class Phone{

    // 생성자
    Phone(String name, String color, int age){
        System.out.println("Name : "+name+" , Color : "+color+" , Month : "+age);
    }

    // 생성자
    Phone(String name, String color){
        System.out.println("Name : "+name+" , Color : "+color+" , Month : "+12);
    }
}

public class T10_ClassBeginInJava {
    public static void main(String[] args) {
        Phone p1 = new Phone("iPhone", "White", 6);
        Phone p2 = new Phone("Galaxy", "Blue", 8);

        Phone p3 = new Phone("Pixel", "Gray");
        Phone p4 = new Phone("RedMi", "Black");
    }
}
