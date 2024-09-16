//base class
class Employee {
    private String name;
    private int age;
    private int salary;

    //constructor
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // get, set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println(" Age must be positive.");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println(" Salary must be non-negative.");
        }
    }

    public void work() {
        System.out.println(name = " is working.");
    }

    public void takeBreak() {
        System.out.println(name = " is taking a break.");
    }

    public void performJob() {
        System.out.println(name = " is performing their job.");
    }

    public void describeRole() {
        System.out.println("Employee: " + name);
    }


    public void describeRole(String extraInfo) {
        System.out.println("Employee: " + name + ". " + extraInfo);
    }
}

