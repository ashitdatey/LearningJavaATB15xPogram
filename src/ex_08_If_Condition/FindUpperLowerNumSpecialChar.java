package ex_08_If_Condition;

public class FindUpperLowerNumSpecialChar {
    public static void main(String[] args) {
        String str = "SjH23#*y(hjKfL*.?|";
        int upper = 0, lower = 0, special = 0, number = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                upper++;
            }
            else if(ch>='a' && ch<='z')
            {
                lower++;
            }
            else if(ch>='0' && ch<='9')
            {
                number++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("count of upper char are:" +upper);
        System.out.println("count of lower char are:" +lower);
        System.out.println("count of numbers char are:" +number);
        System.out.println("count of special char are:" +special);

    }
}
