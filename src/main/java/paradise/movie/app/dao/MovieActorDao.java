package paradise.movie.app.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paradise.movie.app.model.MovieActor;
import paradise.movie.app.model.MovieActorExample;

public interface MovieActorDao {
    long countByExample(MovieActorExample example);

    int deleteByExample(MovieActorExample example);

    int deleteByPrimaryKey(@Param("movieId") Integer movieId, @Param("actorId") Integer actorId);

    int insert(MovieActor record);

    int insertSelective(MovieActor record);

    List<MovieActor> selectByExample(MovieActorExample example);

    int updateByExampleSelective(@Param("record") MovieActor record, @Param("example") MovieActorExample example);

    int updateByExample(@Param("record") MovieActor record, @Param("example") MovieActorExample example);
}