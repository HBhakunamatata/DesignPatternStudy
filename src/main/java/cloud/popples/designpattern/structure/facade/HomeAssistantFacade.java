package cloud.popples.designpattern.structure.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 家庭助手-外观类
 * @author: Mr.Han
 * @create: 2025-05-05 09:50
 */

public class HomeAssistantFacade {

    private List<ElectricalAppliances> electricalAppliances;

    public HomeAssistantFacade() {
        electricalAppliances = new ArrayList<>();
        electricalAppliances.add(new AirCondition());
        electricalAppliances.add(new Tv());
    }

    private void turnOnAll() {
        electricalAppliances.forEach(ElectricalAppliances::on);
    }

    private void turnOffAll() {
        electricalAppliances.forEach(ElectricalAppliances::off);
    }

    private String getStatus() {
        StringBuilder statusInfo = new StringBuilder();
        for (ElectricalAppliances electricalAppliance : electricalAppliances) {
            statusInfo.append(electricalAppliance.getStatus() + ",");
        }
        String result = statusInfo.toString();
        return result.substring(0, result.lastIndexOf(","));
    }

    public void voiceControl(String words) {
        String controlWord = words.toLowerCase().trim();
        if (controlWord.contains("on")) {
            turnOnAll();
        } else if (controlWord.contains("off")) {
            turnOffAll();
        } else {
            notUnderstand();
            return;
        }
        System.out.print(getStatus());
        return;
    }

    private void notUnderstand() {
        System.out.print("Not understanding...");
    }

}
