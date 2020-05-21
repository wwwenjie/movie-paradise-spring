package paradise.movie.app.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.common.utils.IOUtils;
import org.springframework.stereotype.Service;
import paradise.movie.app.model.Movie;
import paradise.movie.app.util.OSS;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


/**
 * 完善数据，大部分电影没有：
 * 阿里云OSS的海报备份
 * 数据库的 backdrops 字段
 * 数据库的 trailers 字段
 */
@Service
public class ImprovementService {
    final
    MovieService movieService;

    public ImprovementService(MovieService movieService) {
        this.movieService = movieService;
    }

    public void patchPoster(Integer id) throws IOException {
        OSS.upload(id);
    }

    public void patchBackdrops(String path) throws IOException {
        InputStream inputStream = new URL("https://api.dianying.fm/movies/" + path).openStream();
        JSONObject jsonObject = JSONObject.parseObject(IOUtils.readStreamAsString(inputStream, "utf-8"));
        JSONArray backdrops = jsonObject.getJSONArray("backdrops");
        if (backdrops == null) {
            backdrops = JSONObject.parseArray("[]");
        }
        Movie movie = new Movie();
        // todo: json handler in mybatis
        // movie.setBackdrops(backdrops);
        movieService.update(movie);
    }

    public void patchTrailers(Integer id) throws IOException {
        InputStream inputStream = new URL("https://api.dianying.fm/trailers/" + id.toString()).openStream();
        JSONObject jsonObject = JSONObject.parseObject(IOUtils.readStreamAsString(inputStream, "utf-8"));
        JSONArray trailers = jsonObject.getJSONArray("trailers");
        Movie movie = new Movie();
        // todo: json handler in mybatis
        // movie.setTrailers(trailers);
        movieService.update(movie);
    }
}
