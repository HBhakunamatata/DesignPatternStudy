package cloud.popples.designpattern.creation.builder.phone;

/**
 * @description: 手机类
 * @author: Mr.Han
 * @create: 2025-05-03 18:48
 */

public class Phone {

    private String cpu;
    private String memory;
    private String screen;
    private String type;

    private Phone(String cpu, String memory, String screen, String type) {
        this.cpu = cpu;
        this.memory = memory;
        this.screen = screen;
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", memory='").append(memory).append('\'');
        sb.append(", screen='").append(screen).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {
        private String cpu;
        private String memory;
        private String screen;
        private String type;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Phone build() {
            return new Phone(cpu, memory, screen, type);
        }
    }
}
