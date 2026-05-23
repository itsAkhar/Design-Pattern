package DataClump;

public class Employee {
    private EmployeeDetails employeeDetails;
    private ContactInfo contactInfo;

    public void updateEmployee(EmployeeDetails employeeDetails,ContactInfo contactInfo) {
        this.employeeDetails=employeeDetails;
        this.contactInfo=contactInfo;
    }
}
class EmployeeDetails{
    private String name;
    private String department;
    private int salary;

    public EmployeeDetails(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
class ContactInfo{
    private String address;
    private String phoneNumber;

    public ContactInfo(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
