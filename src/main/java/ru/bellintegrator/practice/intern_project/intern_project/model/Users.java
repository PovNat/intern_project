package ru.bellintegrator.practice.intern_project.intern_project.model;

import javax.persistence.*;

@Entity(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Version
    private Integer version;

    @Column(name = "orgId")
    private Integer orgId;

    @Column(name = "officeId", nullable = false)
    private Integer officeId;

    @Column(name = "firstName", length = 50, nullable = false)
    private String firstName;

    @Column(name = "secondName", length = 50, nullable = false)
    private String secondName;

    @Column(name = "middleName", length = 50)
    private String middleName;

    @Column(name = "position", length = 30, nullable = false)
    private String position;

    @Column(name = "phone", length = 30)
    private String phone;

    @Column(name = "citizenshipID", nullable = false)
    private Integer citizenshipID;

    @Column(name = "isIdentified", nullable = false)
    private boolean isIdentified;


    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "org_ID")
    private Offices offices;

    @OneToOne(mappedBy = "citizenship_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private Citizenship citizenship;

    @OneToOne(mappedBy = "us_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private Docdata docdata;

    public Users(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCitizenshipID() {
        return citizenshipID;
    }

    public void setCitizenshipID(Integer citizenshipID) {
        this.citizenshipID = citizenshipID;
    }

    public boolean isIdentified() {
        return isIdentified;
    }

    public void setIdentified(boolean identified) {
        isIdentified = identified;
    }

    public Offices getOffices() {
        return offices;
    }

    public void setOffices(Offices offices) {
        this.offices = offices;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }

    public Docdata getDocdata() {
        return docdata;
    }

    public void setDocdata(Docdata docdata) {
        this.docdata = docdata;
    }
}
