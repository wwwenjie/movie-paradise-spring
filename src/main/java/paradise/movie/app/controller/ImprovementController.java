package paradise.movie.app.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import paradise.movie.app.service.ImprovementService;

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
    // todo: global error handle
    public JSONObject patchPoster(@RequestBody JSONObject data) throws IOException {
        improvementService.patchPoster((Integer) data.get("id"));
        // todo: json util
        return new JSONObject();
    }

    @PatchMapping("/backdrops")
    public JSONObject patchBackdrops(@RequestBody JSONObject data) throws IOException {
        improvementService.patchBackdrops((String) data.get("path"));
        return new JSONObject();
    }

    @PatchMapping("/trailers")
    public JSONArray patchTrailers(@RequestBody JSONObject data) throws IOException {
        return improvementService.patchTrailers((Integer) data.get("id"));
    }
}
