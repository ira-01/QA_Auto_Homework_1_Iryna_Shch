
public class Manager extends Employee {

    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void takeBreak() {
        {
            System.out.println(getName() + " has a 30 min break.");
        }
    }

    public void performJob() {
        System.out.println(getName() + " is working on a project.");
    }

    public void describeRole() {
        System.out.println("Manager: " + getName() );
    }



    public void describeRole(String extraInfo) {
        System.out.println("Manager: " + getName() + ". " + extraInfo);
    }
}
