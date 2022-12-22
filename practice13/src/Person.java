public class Person {
      String name;
      String surname;
      String ot;
      Person(String surname, String name, String ot)
      {
          this.name = name;
          this.surname = surname;
          this.ot = ot;
      }
      Person(){};
      String getFIO()
      {
          if(name.isEmpty() || surname.isEmpty() || ot.isEmpty())
          {
              System.out.println("avokadik2003");
              return "";
          }
          else
          {
              return (surname+" "+name.charAt(0)+"."+ot.charAt(0));
          }
      }
      public static void main(String[] args)
      {
          Person p1 = new Person("Садовников", "Константин", "Сергеевич");
          Person p2 = new Person("", "", "");
          System.out.println(p1.getFIO());
          System.out.println(p2.getFIO());
      }
}
