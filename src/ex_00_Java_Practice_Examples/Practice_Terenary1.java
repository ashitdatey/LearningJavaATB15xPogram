package ex_00_Java_Practice_Examples;

public class Practice_Terenary1 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int Max = (n1>n2) ? n1 : (n2>n3 ? n2 : n3) ;
        System.out.println("Max out of Three is = " + Max);
    }
}
