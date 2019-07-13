public class SalesManager implements Employee
{
    private int fixedSalaryPart;
    private int totalSalary;
    private int minSalary = 50000;
    private int maxSalary = 200000;
    private Income income;
    private String name;
    private String position = "Sales Manager";



    public SalesManager (String name, Company company)
    {
        this.name = name;
        income = company;
        fixedSalaryPart = (int)(Math.random() * (maxSalary - minSalary) + minSalary);
        totalSalary = getMonthSalary();
    }

    @Override
    public int getMonthSalary()
    {
        //System.out.println(income.getMonthIncome());
        return fixedSalaryPart + income.getMonthIncome()/20;
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
