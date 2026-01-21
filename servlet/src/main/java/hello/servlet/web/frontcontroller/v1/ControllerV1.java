package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//프론트 컨트롤러 V1의 컨트롤러 인터페이스
public interface ControllerV1 {

    //서블릿과 동일한 스펙의 메서드
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
