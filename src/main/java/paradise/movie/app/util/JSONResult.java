package paradise.movie.app.util;

import com.alibaba.fastjson.JSONObject;

public class JSONResult {
    // operation success but dose not return data
    public static JSONObject success() {
        JSONObject success = new JSONObject();
        success.put("success", true);
        return success;
    }

    // success and return single result
    public static JSONObject singleResult(String key, Object value) {
        JSONObject singleResult = new JSONObject();
        singleResult.put(key, value);
        return singleResult;
    }

    public static JSONObject thanks() {
        JSONObject singleResult = new JSONObject();
        singleResult.put("message", "Thanks for participating in the user improvement program");
        return singleResult;
    }
}
