package ru.bellintegrator.practice.intern_project.intern_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity(name = "Docname")
public class Docname {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documentID")
    private Integer documentID;

    @Version
    private Integer version;

    @Column(name = "documentName", length = 30, nullable = false)
    private String documentName;

    @Column(name = "documentCode")
    private Integer documentCode;

    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "documentID")
    private Docdata docdata;

    public Docname(){
    }

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Integer getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(Integer documentCode) {
        this.documentCode = documentCode;
    }

    public Docdata getDocdata() {
        return docdata;
    }

    public void setDocdata(Docdata docdata) {
        this.docdata = docdata;
    }
}
