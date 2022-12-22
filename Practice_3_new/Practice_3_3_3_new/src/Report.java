public abstract class Report {
    static public void generateReport(Employee[] arr)
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.printf("%30d %n", arr[i].getSalary());
        }
    }
}
