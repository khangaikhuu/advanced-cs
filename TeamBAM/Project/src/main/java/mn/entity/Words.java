package mn.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Words {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Word is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Translation is mandatory")
    @Column(name = "translation")
    private String translation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
