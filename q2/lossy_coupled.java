

import com.spring.example1.spring_demo.SpringDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class lossy_coupled {
    public static void main(String args[]) {
        SpringApplication.run(SpringDemoApplication.class, args);
        Box b = new Box(25, 25, 25);
        System.out.println(b.getVolume());
    }
}

final class Box {
    private int volume;
    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }
    public int getVolume() {
        return volume;
    }
}
