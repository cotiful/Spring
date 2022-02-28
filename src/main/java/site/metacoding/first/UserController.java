package site.metacoding.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//데이터를 리턴함 (print)
@RestController
public class UserController {

    // DI라고 함.의존성 주입
    // IOC에서 찾고 있음, 만약 Dog가 IOC에 없다면 찾을 수가 없음.
    public UserController(Dog d, HttpServletRequest request) { // DispatcherServelet이
        System.out.println("usercontroller 생성자 생성됨");
    }

    @GetMapping("/home")
    public void home() {
        System.out.println("Home~~~~~~~~~~");
    }

    @GetMapping("/bye")
    public void bye() {
        System.out.println("bye~~~~~~~~~");
    }

    @GetMapping("/data")
    public String data() {
        return "<h1>Data~~~~~~~~~~</h1>";
    }
}
