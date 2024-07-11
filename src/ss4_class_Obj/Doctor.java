package ss4_class_Obj;

import java.time.LocalDate;

public class Doctor {
    private String name;
    private int birthday;
    private String Address;
    private String email;
    private int phonenumber;
    private String workposition;

    public Doctor(){
    }
    public Doctor(String name, int birthday, String address, String email, int phonenumber, String workposition) {
        this.name = name;
        this.birthday = birthday;
        Address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.workposition = workposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getWorkposition() {
        return workposition;
    }

    public void setWorkposition(String workposition) {
        this.workposition = workposition;
    }

    public void DoctorInfo(){
        System.out.println("Thông tin bác sĩ");
        System.out.println("Tên" + name);
        System.out.println("Tuổi"+birthday);
        System.out.println("địa chỉ" + Address);
        System.out.println("Số điện thoại"+ phonenumber);
        System.out.println("nơi làm việc" + workposition);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", Address='" + Address + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                ", workposition='" + workposition + '\'' +
                '}';
    }
}

