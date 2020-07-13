package ru.bellintegrator.practice.intern_project.intern_project.model;

import javax.persistence.*;

@Entity(name = "Docdata")
public class Docdata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usID")
    private Integer usID;

    @Version
    private Integer version;

    @Column(name = "docID",nullable = false)
    private Integer docID;

    @Column(name = "docNumber", length = 20)
    private String documentName;

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
