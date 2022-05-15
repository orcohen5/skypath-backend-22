package spic.backend.icd;

public class Photo {

    public Photo(String title, String image) {
        this.title = title;
        this.image = image;
    }

    private String title;
    private String image;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }
}
