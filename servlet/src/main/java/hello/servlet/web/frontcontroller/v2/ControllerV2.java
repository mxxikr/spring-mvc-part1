package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//프론트 컨트롤러 V2의 컨트롤러 인터페이스
public interface ControllerV2 {
    //컨트롤러가 MyView 객체를 직접 생성하여 반환
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
