package paradise.movie.app.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
    public JSONObject patchPoster(@RequestParam("id") Integer id) throws IOException {
        improvementService.patchPoster(id);
        // todo: json util
        return new JSONObject();
    }

    @PatchMapping("/backdrops")
    public JSONObject patchBackdrops(@RequestParam("path") String path) throws IOException {
        improvementService.patchBackdrops(path);
        return new JSONObject();
    }

    @PatchMapping("/trailers")
    public JSONObject patchTrailers(@RequestParam("id") Integer id) throws IOException {
        improvementService.patchTrailers(id);
        return new JSONObject();
    }
}
