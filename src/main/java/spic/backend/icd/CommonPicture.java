package spic.backend.icd;

public class CommonPicture {
    private String categoryName;
    private String pictureName;
    private String picture;

    public CommonPicture(String categoryName, String pictureName, String picture) {
        this.categoryName = categoryName;
        this.pictureName = pictureName;
        this.picture = picture;
    }

    public CommonPicture() {

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
