public class OperationsOfficer implements Employee
{
    private int fixedSalaryPart;
    private int totalSalary;
    private int minSalary = 20000;
    private int maxSalary = 60000;
    private String name;
    private String position;

    public OperationsOfficer (String name)
    {
        this.name = name;
        position = "Operations Officer";
        fixedSalaryPart = (int)(Math.random() * (maxSalary - minSalary) + minSalary);
        totalSalary = getMonthSalary();
    }


    @Override
    public int getMonthSalary() {
        return fixedSalaryPart;
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
