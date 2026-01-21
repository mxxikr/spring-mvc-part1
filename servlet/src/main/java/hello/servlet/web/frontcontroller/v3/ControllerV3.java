package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

//프론트 컨트롤러 V3의 컨트롤러 인터페이스
public interface ControllerV3 {
    //서블릿 종속성 제거, ModelView 객체 반환
    ModelView process(Map<String, String> paramMap);
}
