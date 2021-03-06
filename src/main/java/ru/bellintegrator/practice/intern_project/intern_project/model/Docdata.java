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
 * Данные документов
 */
@Entity(name = "Docdata")
public class Docdata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usID")
    private Integer usID;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * ID документа
     */
    @Column(name = "docID",nullable = false)
    private Integer docID;

    /**
     * Номер документа
     */
    @Column(name = "docNumber", length = 20)
    private String documentName;

    /**
     * Дата выдачи
     */
    @Column(name = "docDate", length = 20)
    private String docDate;


    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "us_ID")
    private Users users;

    @OneToOne(mappedBy = "documentID", fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private Docname docname;

    public Docdata(){
    }

    public Integer getUsID() {
        return usID;
    }

    public void setUsID(Integer usID) {
        this.usID = usID;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDocID() {
        return docID;
    }

    public void setDocID(Integer docID) {
        this.docID = docID;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Docname getDocname() {
        return docname;
    }

    public void setDocname(Docname docname) {
        this.docname = docname;
    }
}
