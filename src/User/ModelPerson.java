/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author makss
 */
public class ModelPerson {
    private int id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String dOb;
    private String pOb;
    private String wantedArticle;
    
    public ModelPerson() {
        
    }

    public ModelPerson(int id, String firstName, String lastName, String fatherName, String dOb, String pOb, String wantedArticle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dOb = dOb;
        this.pOb = pOb;
        this.wantedArticle = wantedArticle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }

    public String getpOb() {
        return pOb;
    }

    public void setpOb(String pOb) {
        this.pOb = pOb;
    }

    public String getWantedArticle() {
        return wantedArticle;
    }

    public void setWantedArticle(String wantedArticle) {
        this.wantedArticle = wantedArticle;
    }
    
    
}
