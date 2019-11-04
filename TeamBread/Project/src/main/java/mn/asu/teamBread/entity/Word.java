package mn.asu.teamBread.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Translation is mandatory")
    @Column(name = "translation")
    private String translation;

    public Word() {}

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getName() {
        return name;
    }

    public String getTranslation() {
        return translation;
    }

}
