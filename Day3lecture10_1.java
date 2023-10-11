class Test {
    static int x = 10;
    static double d;
    int y = 90;

    static String s;//JVM will provide default value.

    public static void main(String[] args) {
        Test t = new Test();
        t.x = 897;
        System.out.println(t.x);
        System.out.println(Test.x);
        System.out.println(x);
        System.out.println(d);
        System.out.println(s);
    }
    public void m1(){
        System.out.println(x);
    }
}
