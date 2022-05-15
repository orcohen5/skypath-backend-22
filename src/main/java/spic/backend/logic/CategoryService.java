package spic.backend.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spic.backend.icd.Category;
import spic.backend.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void createNewCategory(Category category) {
        categoryRepository.createNewCategory(category);
    }

    public List<Category> getCategoriesForUser(int userId) {
        List<Category> allCategories = new ArrayList<>();

        allCategories.addAll(categoryRepository.getCommonCategories());
        allCategories.addAll(categoryRepository.getUserCategories(userId));

        return allCategories;
    }

    public void createUserCategoryTable(int userId) {
        categoryRepository.createUserCategoryTable(userId);
    }
}
