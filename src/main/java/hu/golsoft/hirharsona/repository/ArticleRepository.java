package hu.golsoft.hirharsona.repository;

import hu.golsoft.hirharsona.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;

@Repository
public class ArticleRepository {

    @Autowired
    JdbcTemplate jdbc;

    public List<Article> getSel(){
        String sql = "SELECT * FROM art JOIN auth ON art.authid = auth.id WHERE del = 0";
        return jdbc.query(sql,(resultSet, rowNumber) -> {
            Article sel = new Article();
            sel.setId(resultSet.getInt("id"));
            sel.setAuthId(resultSet.getInt("authid"));
            sel.setSubj(resultSet.getString("subj"));
            sel.setDescr(resultSet.getString("descr"));
            sel.setArtic(resultSet.getString("artic"));
            sel.setLast(resultSet.getString("last"));
            sel.setAuthName(resultSet.getString("authname"));
            sel.setStar(resultSet.getFloat("star"));
            return sel;
        });
    }

    public List<Article> getLast(){
        String sqllast = "SELECT * FROM art JOIN auth ON art.authid = auth.id WHERE del = 0 ORDER BY last DESC LIMIT 10";
        return jdbc.query(sqllast,(resultSet, rowNumber) -> {
            Article las = new Article();
            las.setId(resultSet.getInt("id"));
            las.setAuthId(resultSet.getInt("authid"));
            las.setSubj(resultSet.getString("subj"));
            las.setDescr(resultSet.getString("descr"));
            las.setArtic(resultSet.getString("artic"));
            las.setLast(resultSet.getString("last"));
            las.setAuthName(resultSet.getString("authname"));
            las.setStar(resultSet.getFloat("star"));
            return las;
        });
    }
}
