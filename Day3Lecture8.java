class Day3Lecture8 {
    public static void main(String[] args) {
       int[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        System.out.println(x[0][1][2]);
        System.out.println(x[1][0][1]);
        System.out.println(x[1][0][0]);
//        System.out.println(x[1][2][0]); Runtime exception
//        System.out.println(x[1][1][1]); ArrayOutOfBoundException.
//        System.out.println(x[2][1][0]);
        String[] s = {"A","BB","CCC"};
        System.out.println(s.length);
//        System.out.println(s.length()); compile time error
//        System.out.println(s[0].length); because this is not the method and variable of the string class
        System.out.println(s[0].length());

        Object[] ob = new Object[5];
        ob[0] = new int[30];
        ob[1] = new float[34];
        ob[2] = new String("Avinash");
//        ob[3] = new Integer(40);
        System.out.println(ob[0]);


    }
}
