public class SalesManager implements Employee
{
    private int fixedSalaryPart;
    private int minSalary = 50000;
    private int maxSalary = 200000;


    public SalesManager ()
    {
        fixedSalaryPart = (int)(Math.random() * (maxSalary - minSalary) + minSalary);
    }

    @Override
    public int getMonthSalary()
    {

        return fixedSalaryPart + Company.getMonthIncome()/20;
    }
}
