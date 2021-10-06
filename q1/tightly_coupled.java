import com.spring.example1.spring_demo.SpringDemoApplication;
import org.springframework.boot.SpringApplication;

class tightly_coupled{
    public static void main(String args[]) {
        SpringApplication.run(SpringDemoApplication.class, args);

        Box1 b = new Box1(25, 25, 25);
        System.out.println(b.volume1);
    }
}

class Box1 {
    public int volume1;
    Box1(int length, int width, int height) {
        this.volume1 = length * width * height;
    }
}
