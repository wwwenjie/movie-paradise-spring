package paradise.movie.app.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paradise.movie.app.model.Actor;
import paradise.movie.app.model.ActorExample;

public interface ActorDao {
    long countByExample(ActorExample example);

    int deleteByExample(ActorExample example);

    int deleteByPrimaryKey(Integer actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    List<Actor> selectByExample(ActorExample example);

    Actor selectByPrimaryKey(Integer actorId);

    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}