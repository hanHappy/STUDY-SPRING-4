package hello.servlet.web.frontcontroller;

import java.util.*;

import lombok.Getter;
import lombok.Setter;

// 4-4 Model 추가 - v3
@Getter @Setter
public class ModelView {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();
    
    public ModelView(String viewName) {
        this.viewName = viewName;
    }

}
