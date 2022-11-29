
public class Main {
    public static void main(String[] args) {
        DateOfBirth Shalomdate = new DateOfBirth(1, 1, 1990);
        DateOfBirth Lialdate = new DateOfBirth(2, 2, 1991);
        DateOfBirth Sivandate = new DateOfBirth(3, 3, 1992);
        DateOfBirth Ohaddate = new DateOfBirth(4, 4, 1993);
        DateOfBirth Eyaldate = new DateOfBirth(5, 5, 1994);

        SalariedEmployee salariedEmployee = new SalariedEmployee("Shalom", "Cohen", "111111", 900.00, Shalomdate);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Lial", "Vered", "222222", 19.6, 50, Lialdate);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sivan", "Shlomi", "333333", 10000, .07, Sivandate);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Ohad", "Gold", "444444", 9000, .05, 400, Ohaddate);
        PieceWorker pieceWorkerEmployee = new PieceWorker("Eyal", "Biton", "555555", Eyaldate, 12);

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorkerEmployee;

        System.out.printf("Employees processed polymorphicaly: %n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
    }
}