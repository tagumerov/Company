public class OperationsOfficer implements Employee
{
    private int fixedSalaryPart;
    private int minSalary = 20000;
    private int maxSalary = 60000;

    public OperationsOfficer ()
    {
        fixedSalaryPart = (int)(Math.random() * (maxSalary - minSalary) + minSalary);
    }


    @Override
    public int getMonthSalary() {
        return fixedSalaryPart;
    }
}
