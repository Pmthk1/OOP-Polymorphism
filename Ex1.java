public class Ex1 {
    public static void main(String[] args) {
        Sale s1 = new Sale("John", 15000, 10000, "Sale");
        s1.showDetails();

        Programmer p1 = new Programmer("Jane", 30000, 5, "Programmer");
        p1.showDetails();
    }
}

class Employee {
    protected String name;
    protected String position;

    Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void calSalary() {
        System.out.println("Cannot use this method");
    }

    public void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
    }
}

class Sale extends Employee {
    private double salary;
    private double commission;

    Sale(String name, double salary, double commission, String position) {
        super(name, position);
        this.salary = salary;
        this.commission = commission;
    }

    @Override
    public void calSalary() {
        System.out.println("Salary = " + (this.salary + this.commission));
    }

    @Override
    public void showDetails() {
        super.showDetails();
        this.calSalary();
    }
}

class Programmer extends Employee {
    private double salary;
    private int Lang;

    Programmer(String name, double salary, int Lang, String position) {
        super(name, position);
        this.salary = salary;
        this.Lang = Lang;
    }

    @Override
    public void calSalary() {
        System.out.println("Salary = " + (this.salary + (Lang * 1000)));
    }

    @Override
    public void showDetails() {
        super.showDetails();
        this.calSalary();
    }
}




