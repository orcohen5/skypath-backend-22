package spic.backend.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import spic.backend.icd.CommonPicture;

import java.util.List;

@Service
public class CommonPicturesRepository {

    private static final String TABLE_NAME = "CommonPictures";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CommonPicture> getCommonPictures() {
        String sql = "SELECT * from " + TABLE_NAME;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CommonPicture.class));
    }

    public List<CommonPicture> getCommonPictures(int userId) {
        String sql = "SELECT * from " + TABLE_NAME + "_" + userId;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CommonPicture.class));
    }

    public void createNewCommonPicture(CommonPicture commonPicture) {
        String sql = "INSERT INTO " + TABLE_NAME + " VALUES (" + commonPicture.getCategoryName() + " , " + commonPicture.getPictureName() + ", " + commonPicture.getPicture() + ")";
        jdbcTemplate.execute(sql);
    }

    public void createUserPictureTable(int userId) {
        String sql = "CREATE TABLE " + TABLE_NAME + "_" + userId + "(CategoryName TEXT PRIMARY_KEY, PictureName TEXT PRIMARY_KEY, Picture TEXT)";

        jdbcTemplate.execute(sql);
    }
}
