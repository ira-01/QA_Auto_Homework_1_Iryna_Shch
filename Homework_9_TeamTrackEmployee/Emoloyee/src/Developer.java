public class Developer extends Employee {
    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void takeBreak() {
        {
            System.out.println(getName() + " works non-stop.");
        }
    }

    public void performJob() {
        System.out.println(getName() + " is writing code.");
    }

    public void describeRole() {
        System.out.println("Developer: " + getName());
    }



    public void describeRole(String extraInfo) {
        System.out.println("Employee: " + getName() + ". " + extraInfo);
    }

}
