package hello.servlet.web.frontcontroller.v4;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

//프론트 컨트롤러 V4의 컨트롤러 인터페이스
public interface ControllerV4 {
    /**
     * ModelView를 직접 생성하지 않고, 모델은 파라미터로 받고 뷰 이름만 반환하여 편의성 증대
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
