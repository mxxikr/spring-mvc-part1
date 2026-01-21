package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//V5, 컨트롤러(핸들러)를 처리하고 그 결과를 ModelView로 변환하는 어댑터 인터페이스
public interface MyHandlerAdapter {
    //어댑터가 해당 핸들러를 지원하는지 여부 확인
    boolean supports(Object handler);

    //핸들러를 실제 호출하고, 그 결과를 ModelView로 통일하여 반환
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
