package hello.servlet.web.frontcontroller.v3;

import java.util.Map;
import hello.servlet.web.frontcontroller.ModelView;

// 4-4 Model 추가 - v3
public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
