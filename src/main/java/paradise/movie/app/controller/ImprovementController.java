package paradise.movie.app.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import paradise.movie.app.service.ImprovementService;
import paradise.movie.app.util.JSONResult;

import java.io.IOException;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = {"http://localhost:8080", "https://movie.jinwenjie.me"})
public class ImprovementController {
    private final ImprovementService improvementService;

    public ImprovementController(ImprovementService improvementService) {
        this.improvementService = improvementService;
    }

    @PatchMapping("/poster")
    public JSONObject patchPoster(@RequestBody JSONObject data) throws IOException {
        improvementService.patchPoster((Integer) data.get("id"));
        return JSONResult.thanks();
    }

    @PatchMapping("/backdrops")
    public JSONObject patchBackdrops(@RequestBody JSONObject data) throws IOException {
        improvementService.patchBackdrops((String) data.get("path"));
        return JSONResult.thanks();
    }

    @PatchMapping("/trailers")
    public JSONArray patchTrailers(@RequestBody JSONObject data) throws IOException {
        return improvementService.patchTrailers((Integer) data.get("id"));
    }
}
