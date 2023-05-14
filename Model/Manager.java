/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.Date;

import DTO.Mappers.EGender;
import java.io.Serializable;

/**
 *
 * @author auxlu
 */
public class Manager extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     * The unique identifier of the staff member.
     */
    private String staffId;
    /**
     * 
     * The date when the staff member was hired.
     */
    private Date hireDate;
    /**
     * 
     * The salary of the staff member.
     */
    private double salary;
    /**
     * 
     * The gym where the staff member works.
     */
    private String gym;

    public Manager() {

    }

    // This is a constructor for the Manager class that takes in several parameters
    // to initialize the
    // Manager object. It calls the constructor of the superclass (User) using the
    // `super` keyword and
    // passes in the relevant parameters. It also sets the `hireDate` to the current
    // date, `staffId` to
    // the `CPF` parameter, `salary` to 5000, and `gym` to the `gym` parameter.
    public Manager(String CPF, String username, String firstName, String lastName, String email, String password,
            String phoneNumber,
            LocalDate birthDate,
            EGender gender, String city, String state, String Country, String gym) {
        super(CPF, username, firstName, lastName, email, password, phoneNumber, birthDate, gender, city, state,
                Country);
        this.hireDate = new Date();
        this.staffId = CPF;
        this.salary = 5000;
        this.gym = gym;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }
}
