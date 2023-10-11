public class Day3Lecture10 {
    int x = 10;
    double d;//Default value will be 0
    boolean b;//Default value will be false
    String s;//default value will be null
    int y;
    public static void main(String[] args) {
//        System.out.println(x);
//        we can access only static variable from outside main function.
//        we cant access instance variable from static area. but we can access by using object
//        reference. But we can access instance variable from instance area.
        Day3Lecture10 obj = new Day3Lecture10();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.s);
        System.out.println(obj.b);


    }
}
