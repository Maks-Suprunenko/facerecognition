package Capture;

public class ModelPerson {

    private int id;
    private String first_name, last_name, date_of_birth, father_name, place_of_birth, tax_payer, article, image, date;

    public ModelPerson() {
    }

    public ModelPerson(String first_name, String last_name, String image) { //LastPerson
        this.first_name = first_name;
        this.last_name = last_name;
        this.image = image;
    }

    public ModelPerson(int id, String first_name, String last_name, String date_of_birth, String father_name, String place_of_birth, String tax_payer, String article, String date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.father_name = father_name;
        this.place_of_birth = place_of_birth;
        this.tax_payer = tax_payer;
        this.article = article;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() {
        return date_of_birth;
    }

    public void setDob(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getFathername() {
        return father_name;
    }

    public void setFathername(String father_name) {
        this.father_name = father_name;
    }


    public String getPob() {
        return place_of_birth;
    }

    public void setPob(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getTaxpayer() {
        return tax_payer;
    }

    public void setTaxpayer(String tax_payer) {
        this.tax_payer = tax_payer;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
