package ss5_AM_static;

public class Emloyee {
    private String name;
    private String phoneNumber;
    private String department;
    private static String companyName = "ABC Trading Company";

    public Emloyee() {
    }



    public Emloyee(String name, String phoneNumber, String department) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Emloyee.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
