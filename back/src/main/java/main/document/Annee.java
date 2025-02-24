package main.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Annee {
    @Id
    private Integer id;
    private String annee;

    public Annee() {
    }

    public Annee(Integer id, String annee) {
        this.id = id;
        this.annee = annee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Annee{" +
                "id=" + id +
                ", annee='" + annee + '\'' +
                '}';
    }
}
