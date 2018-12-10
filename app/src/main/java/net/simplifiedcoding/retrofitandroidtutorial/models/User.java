package net.simplifiedcoding.retrofitandroidtutorial.models;

public class User {

    private int id;
    private String status, statusMessage, staff,Designation,Department;

    public User( String status, String statusMessage, String staff, String designation, String department) {

        this.status = status;
        this.statusMessage = statusMessage;
        this.staff = staff;
        this.Designation = designation;
        this.Department = department;
    }



    public String getStatus() {
        return status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getStaff() {
        return staff;
    }

    public String getDesignation(){return Designation;}

    public String getDepartment(){return Department;}

}
