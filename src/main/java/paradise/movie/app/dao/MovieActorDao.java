package paradise.movie.app.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paradise.movie.app.model.MovieActorExample;
import paradise.movie.app.model.MovieActorKey;

public interface MovieActorDao {
    long countByExample(MovieActorExample example);

    int deleteByExample(MovieActorExample example);

    int deleteByPrimaryKey(MovieActorKey key);

    int insert(MovieActorKey record);

    int insertSelective(MovieActorKey record);

    List<MovieActorKey> selectByExample(MovieActorExample example);

    int updateByExampleSelective(@Param("record") MovieActorKey record, @Param("example") MovieActorExample example);

    int updateByExample(@Param("record") MovieActorKey record, @Param("example") MovieActorExample example);
}