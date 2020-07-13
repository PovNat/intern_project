package ru.bellintegrator.practice.intern_project.intern_project.model;

import javax.persistence.*;

@Entity(name = "Citizenship")
public class Citizenship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "citizenshipID")
    private Integer citizenshipID;

    @Version
    private Integer version;

    @Column(name = "citizenshipName", length = 20, nullable = false)
    private String citizenshipName;

    @Column(name = "citizenshipCode", nullable = false)
    private Integer citizenshipCode;

    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "citizenship_ID")
    private Users users;

    public Citizenship(){
    }

    public Integer getCitizenshipID() {
        return citizenshipID;
    }

    public void setCitizenshipID(Integer citizenshipID) {
        this.citizenshipID = citizenshipID;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCitizenshipName() {
        return citizenshipName;
    }

    public void setCitizenshipName(String citizenshipName) {
        this.citizenshipName = citizenshipName;
    }

    public Integer getCitizenshipCode() {
        return citizenshipCode;
    }

    public void setCitizenshipCode(Integer citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
