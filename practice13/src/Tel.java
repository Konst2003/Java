import java.util.Formatter;

public class Tel {
     String s;

     public Tel(String s)
     {
         this.s = s;
     }
     String converter()
     {
         if (s.charAt(0) == '+')
         {
             return ("+7" + "(" + s.substring(2, 5) +")" +s.substring(5, 8) +"-" + s.substring(8, 12));
         }
         else if( s.charAt(0) == '8')
         {
             return ("+7" + "(" + s.substring(1, 4) +")" +s.substring(4, 7) +"-" + s.substring(7, 11));
         }
         else
             return "";
     }

    public static void main(String[] args)
    {
        Tel t1 = new Tel("+79160049354");
        System.out.println(t1.converter());

        Tel t2 = new Tel("89160049354");
        System.out.println(t2.converter());
    }

}
