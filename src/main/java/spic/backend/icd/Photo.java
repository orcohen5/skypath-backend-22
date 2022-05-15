package spic.backend.icd;

public class Photo {

    private String title;
    private String image;

    public Photo(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }
}
