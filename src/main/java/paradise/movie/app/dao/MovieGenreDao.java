package paradise.movie.app.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paradise.movie.app.model.MovieGenreExample;
import paradise.movie.app.model.MovieGenreKey;

public interface MovieGenreDao {
    long countByExample(MovieGenreExample example);

    int deleteByExample(MovieGenreExample example);

    int deleteByPrimaryKey(MovieGenreKey key);

    int insert(MovieGenreKey record);

    int insertSelective(MovieGenreKey record);

    List<MovieGenreKey> selectByExample(MovieGenreExample example);

    int updateByExampleSelective(@Param("record") MovieGenreKey record, @Param("example") MovieGenreExample example);

    int updateByExample(@Param("record") MovieGenreKey record, @Param("example") MovieGenreExample example);
}