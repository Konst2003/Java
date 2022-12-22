import java.util.Random;
public class Employee extends Report {
    String fullname;
    int salary;

    public Employee(String fullname, int salary )
    {
        this.fullname=fullname;
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }

    public static void main(String[] args)
    {
        Random r = new Random();
        Employee[] a = new Employee[100];
        for (int i =0; i<100; i++)
        {
            a[i] = new Employee("kek",  (int) (50 + Math.random() * 100));
        }
        generateReport(a);
    }
}
