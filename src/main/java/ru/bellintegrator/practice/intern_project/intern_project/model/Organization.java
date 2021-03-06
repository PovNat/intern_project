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

/**
 * Организации
 */
@Entity(name = "Organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * Название организации
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Полное название организации
     */
    @Column(name = "fullName", length = 50, nullable = false)
    private String fullName;

    /**
     * Адрес организации
     */
    @Column(name = "address", length = 50, nullable = false)
    private String address;

    /**
     * номер телефона
     */
    @Column(name = "phone", length = 30, nullable = false)
    private String phone;

    /**
     * ИНН
     */
    @Column(name = "inn", length = 30, nullable = false)
    private String inn;

    /**
     * КПП
     */
    @Column(name = "kpp", length = 30, nullable = false)
    private String kpp;

    /**
     * Актуальность
     */
    @Column(name = "isActive", nullable = false)
    private boolean isActive;

    @OneToOne(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private Offices offices;

    public Organization(){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Offices getOffices() {
        return offices;
    }

    public void setOffices(Offices offices) {
        this.offices = offices;
    }
}
