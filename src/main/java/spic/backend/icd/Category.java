package spic.backend.icd;

public class Category {
    private String CategoryName;
    private String CategoryPicture;

    public Category(String categoryName, String categoryPicture) {
        this.CategoryName = categoryName;
        this.CategoryPicture = categoryPicture;
    }

    public Category() {

    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        this.CategoryName = categoryName;
    }

    public String getCategoryPicture() {
        return CategoryPicture;
    }

    public void setCategoryPicture(String categoryPicture) {
        this.CategoryPicture = categoryPicture;
    }
}
