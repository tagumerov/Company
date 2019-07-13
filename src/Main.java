import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите название компании:");
        String input = in.nextLine();
        Company company = new Company(input); //создаем компанию
        SalesManager salesManager;
        TopManager topManager;
        OperationsOfficer operationsOfficer;

        System.out.println("Ведите месячный доход компании:");
        int monthIncome = in.nextInt();
        company.setMonthIncome(monthIncome); //задаем месячный доход

        for(int i = 0; i < 100;i++) //создаем 100 SalesManager
        {
            salesManager = new SalesManager("SalesManager" + i, company);
            company.hireEmployees(salesManager);
        }

        for(int i = 0; i < 100;i++) //создаем 100 TopManager
        {
            topManager = new TopManager("TopManager" + i, company);
            company.hireEmployees(topManager);
        }

        for(int i = 0; i < 100;i++) //создаем 100 OperationsOfficer
        {
            operationsOfficer = new OperationsOfficer("OperationsOfficer" + i);
            company.hireEmployees(operationsOfficer);
        }


        //выводим маскимальные зарплаты
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("Максимальные зарплаты");
        for(Employee employee : company.getTopSalaryStaff(100))
        {
            System.out.println("Должность: " + employee.getPosition() + "\t" + "Имя: " + employee.getName() + "\t" + "Доход: " + employee.getMonthSalary());
        }

        //выводим минимальные зарплаты
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("Минимальные зарплаты");
        for(Employee employee : company.getLowestSalaryStaff(100))
        {
            System.out.println("Должность: " + employee.getPosition() + "\t" + "Имя: " + employee.getName() + "\t" + "Доход: " + employee.getMonthSalary());
        }

    }
}
