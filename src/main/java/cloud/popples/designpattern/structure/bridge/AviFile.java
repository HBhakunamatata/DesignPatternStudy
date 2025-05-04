package cloud.popples.designpattern.structure.bridge;

/**
 * @description: Avi文件
 * @author: Mr.Han
 * @create: 2025-05-04 19:36
 */

public class AviFile implements VideoFile{

    @Override
    public String decode(String filename) {
        return filename + ".avi";
    }
}
