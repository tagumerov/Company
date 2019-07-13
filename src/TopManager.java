public class TopManager implements Employee
{
    private int fixedSalaryPart;
    private int totalSalary;
    private int minSalary = 200000;
    private int maxSalary = 500000;
    private Income income;
    private String name;
    private String position;

    public TopManager (String name, Company company)
    {
        this.name = name;
        income = company;
        position = "Top Manager";
        fixedSalaryPart = (int)(Math.random() * (maxSalary - minSalary) + minSalary);
        totalSalary = getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        if(income.getMonthIncome() >= income.getMonthBountyLevel())
        {
            return fixedSalaryPart + income.getMonthIncome()/10;
        }
        else
            {
                return fixedSalaryPart;
        }
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getName() {
        return name;
    }
}
