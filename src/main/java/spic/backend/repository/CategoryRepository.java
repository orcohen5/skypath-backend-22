package spic.backend.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spic.backend.icd.Category;

import java.util.List;

@Repository
public class CategoryRepository {
    private static final String TABLE_NAME = "categories_t";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> getCommonCategories() {
        String sql = "SELECT * from " + TABLE_NAME;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Category.class));
    }

    public List<Category> getUserCategories(int userId) {
        String sql = "SELECT * from " + TABLE_NAME + "_" + userId;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Category.class));
    }

    public void createNewCategory(Category category) {
    String sql =
        "INSERT INTO " + TABLE_NAME + " VALUES (? , ?)";

        jdbcTemplate.update(sql, category.getCategoryName(), category.getCategoryPicture());
    }

    public void createUserCategoryTable(int userId) {
        String sql = "CREATE TABLE " + userId + TABLE_NAME + "(NAME TEXT PRIMARY_KEY, FILE TEXT)";

        jdbcTemplate.execute(sql);
    }
}
