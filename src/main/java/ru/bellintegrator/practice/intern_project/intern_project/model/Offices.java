package ru.bellintegrator.practice.intern_project.intern_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

/**
 * Офисы
 */
@Entity(name = "Offices")
public class Offices {

    /**
     * Уникальный ID организации
     */
    @Column(name = "orgId", nullable = false)
    private Integer orgId;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Уникальный ID организации
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Адрес офиса
     */
    @Column(name = "address", length = 50, nullable = false)
    private String address;

    /**
     * Номер телефона
     */
    @Column(name = "phone", length = 30)
    private String phone;

    /**
     * Актуальность
     */
    @Column(name = "isActive", nullable = false)
    private boolean isActive;

    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "org_ID")
    private Organization organization;

    @OneToOne(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private Users users;

    public Offices(){
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
