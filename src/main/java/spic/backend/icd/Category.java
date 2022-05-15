package spic.backend.icd;

public class Category {
    public Category(String name, String photo) {
        this.name = name;
        this.photo = photo;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String photo;
}
