package cloud.popples.designpattern.structure.bridge;

/**
 * @description: Mac操作系统
 * @author: Mr.Han
 * @create: 2025-05-04 19:37
 */

public class MacOperatorSystem implements OperatorSystem {

    private VideoFile videoFile;

    public MacOperatorSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    @Override
    public void play(String fileName) {
        System.out.print("Playing " + videoFile.decode(fileName));
    }
}
