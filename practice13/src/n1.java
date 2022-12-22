public class n1 {
    String s;
    public n1(String s)
    {
        this.s = s;
    }
     void method1()
     {
         System.out.println(s);

         System.out.println("Последний символ - " + s.charAt(s.length()-1));

         if (s.endsWith("!!!"))
         {
             System.out.println("Заканчивается на !!!");
         }
         else
         {
             System.out.println("Не заканчивается на !!!");
         }

         if (s.startsWith("I like"))
         {
             System.out.println("Начинается на I like");
         }
         else
         {
             System.out.println("Не начинается на I like");
         }

         if (s.contains("Java"))
         {
             System.out.println("Java есть на месте с индексом = "+ s.indexOf("Java"));
         }
         else
         {
             System.out.println("Нет Java");
         }

         System.out.println(s.replace('a', 'o'));
         System.out.println(s.toUpperCase());
         System.out.println(s.toLowerCase());
         System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java")+4));

     }

    public static void main(String[] args)
    {
        n1 s1 = new n1("I like Java...");
        s1.method1();
    }

}
