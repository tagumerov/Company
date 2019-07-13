import java.util.ArrayList;


public class Company implements Income
{
    private String companyName;
    private int monthIncome; //доход комапании
    private int bountyLevel = 10000; //порог дохода компании для бонуса топам
    private ArrayList<Employee> employees = new ArrayList<>();


    public Company (String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public int getMonthIncome()
    {
        return monthIncome;
    }

    @Override
    public int getMonthBountyLevel()
    {
        return bountyLevel;
    }

    @Override
    public void setMonthIncome(int monthIncome)
    {
        this.monthIncome = monthIncome;
    }

    public void hireEmployees(Employee employee) //нанимаем работника
    {
        employees.add(employee);
    }

    public void fireEmployees(Employee employee) //увольняем работника
    {
       employees.remove(employee);
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) // получаем список самых больших зарплат
    {
        if(employees.size() == 0)
        {
            System.out.println("В компании отсутствуют работники");
            return null;
        }
        else
        {
            if (employees.size() < count) // сортируем пузырьком
            {
                return bubbleSorterDecrease(employees.size());
            }
            else
            {
                return bubbleSorterDecrease(count);
            }

        }
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) // получаем список самых маленьких зарплат
    {
        if(employees.size() == 0)
        {
            System.out.println("В компании отсутствуют работники");
            return null;
        }
        else
        {
            if(employees.size() < count)
            {
                return bubbleSorterIncrease(employees.size());
            }
            else
            {
                return bubbleSorterIncrease(count);
            }
        }

    }

    private ArrayList<Employee> bubbleSorterDecrease(int cout) //сортировка по убыванию зп
    {
        ArrayList<Employee> TopSalaryStaff = new ArrayList<>(); //список, куда заносится результат
        for (int i = 0; i < cout; i++ ) //делаем сортировку только по требуемому количеству
        {
            for (int y = employees.size() -1; y > i; y--)
            {
                if(employees.get(y).getMonthSalary() >= employees.get(y-1).getMonthSalary())
                {
                    toSwap(y, y - 1);
                }
            }
            TopSalaryStaff.add(employees.get(i)); //заносим отсортированный объект в список
        }
        return TopSalaryStaff;
    }

    private void toSwap (int last, int beforeLast) //перестановка элементов массива
    {
        Employee dummy = employees.get(last);
        employees.set(last, employees.get(beforeLast));
        employees.set(beforeLast, dummy);
    }

    private ArrayList<Employee> bubbleSorterIncrease(int cout) //сортировка по возрастанию зп
    {
        ArrayList<Employee> LowSalaryStaff = new ArrayList<>(); //список, куда заносится результат
        for (int i = 0; i< cout; i++ ) //делаем сортировку только по требуемому количеству
        {
            for (int y = employees.size() -1; y > i; y--)
            {
                if(employees.get(y).getMonthSalary() <= employees.get(y-1).getMonthSalary())
                    toSwap(y, y-1);
            }
            LowSalaryStaff.add(employees.get(i)); //заносим отсортированный объект в список
        }
        return LowSalaryStaff;
    }



}
