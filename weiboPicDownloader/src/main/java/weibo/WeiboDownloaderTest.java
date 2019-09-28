package weibo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

class WeiboDownloaderTest {

    public static void main(String[] args) throws IOException {
        List<String> strings = FileUtils.readLines(new File("E:\\Shane\\Desktop\\Untitled-1.txt"));
        System.out.println(strings.size());
        try {
            WeiboDownloader.download(strings);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}