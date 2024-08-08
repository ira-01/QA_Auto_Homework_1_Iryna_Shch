public class Designer extends Employee {
    public Designer(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void takeBreak() {
        {
            System.out.println(getName() + " takes a break every hour for 5-10 minutes.");
        }
    }

    public void performJob() {
        System.out.println(getName() + " is designing a user interface.");
    }

    public void describeRole() {
        System.out.println("Designer: " + getName());
    }



    public void describeRole(String extraInfo) {
        System.out.println("Employee: " + getName() + ". " + extraInfo);
    }

}