import java.util.ArrayList;

public class Company
{

    private static int monthIncome; //доход комапании
    private static int bountyLevel = 10000000; //порог дохода компании для бонуса топам
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company ()
    {

    }

    public static int getMonthIncome() {
        return monthIncome;
    }

    public static void setMonthIncome(int monthIncome) {
        Company.monthIncome = monthIncome;
    }

    public static int getBountyLevel() {
        return bountyLevel;
    }

    public void hireEmployee()
    {

    }

    public void fireEmployee()
    {

    }

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        return null;
    }
}
