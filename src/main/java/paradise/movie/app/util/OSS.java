package paradise.movie.app.util;

import com.aliyun.oss.OSSClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class OSS {
    public static void upload(Integer id) throws IOException {
        String endpoint = "";
        String accessKeyId = "";
        String accessKeySecret = "";
        String bucketName = "";
        String api = "https://img.dianying.fm/poster/";
        String extend = ".jfif";

        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        InputStream inputStream = new URL(api + id.toString()).openStream();
        ossClient.putObject(bucketName, "poster/" + id.toString() + extend, inputStream);
        System.out.println("Add poster: " + "https://" + bucketName + "." + endpoint + "/poster/" + id.toString() + extend + " OK");
        ossClient.shutdown();
        // todo: backup in local
    }
}
