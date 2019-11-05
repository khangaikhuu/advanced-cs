package mn.asu.persistence;

public class Words {
    private int id;
    private String name;
    private String translation;
    private String explanation;
    private String imageURL;

    public Words()
    {
    }

    public Words(int id, String name, String translation, String explanation, String imageURL) {
        this.id = id;
        this.name = name;
        this.translation = translation;
        this.explanation = explanation;
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
