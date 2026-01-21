package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

//V3, 뷰의 논리적 이름과 모델 데이터를 담는 객체
public class ModelView {
    //뷰의 논리 이름
    private String viewName;
    //뷰에 전달할 모델 데이터
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}