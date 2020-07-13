package ru.bellintegrator.practice.intern_project.intern_project.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;

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

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "book_id", nullable = false)
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
