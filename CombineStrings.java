import java.util.Scanner;
public class CombineStrings
{
    public static void main(String[] args)
    { 
        CombineStrings obj=new CombineStrings();
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(obj.combineStrings(a,b));
    }
     String combineStrings(String a, String b)
    {
       if(a.length() > b.length())
       {
        return a+b+a;
       }
       if(a.length() < b.length())
       {
           return a+b+a;
       }
       else
       {
        return b+a+b;
       }
    }
}