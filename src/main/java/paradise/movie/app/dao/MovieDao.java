package paradise.movie.app.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paradise.movie.app.model.Movie;
import paradise.movie.app.model.MovieExample;
import paradise.movie.app.model.MovieWithBLOBs;

public interface MovieDao {
    long countByExample(MovieExample example);

    int deleteByExample(MovieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MovieWithBLOBs record);

    int insertSelective(MovieWithBLOBs record);

    List<MovieWithBLOBs> selectByExampleWithBLOBs(MovieExample example);

    List<Movie> selectByExample(MovieExample example);

    MovieWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MovieWithBLOBs record, @Param("example") MovieExample example);

    int updateByExampleWithBLOBs(@Param("record") MovieWithBLOBs record, @Param("example") MovieExample example);

    int updateByExample(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByPrimaryKeySelective(MovieWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MovieWithBLOBs record);

    int updateByPrimaryKey(Movie record);
}