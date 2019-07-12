public class TopManager implements Employee
{
    private int fixedSalaryPart;
    private int minSalary = 200000;
    private int maxSalary = 500000;

    public TopManager ()
    {
        fixedSalaryPart = (int)(Math.random() * (maxSalary - minSalary) + minSalary);
    }

    @Override
    public int getMonthSalary() {
        if(Company.getMonthIncome() >= Company.getBountyLevel())
        {
            return fixedSalaryPart + Company.getMonthIncome()/10;
        }
        else
            {
                return fixedSalaryPart;
        }
    }
}
