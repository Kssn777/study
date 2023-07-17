package summer;

import com.alibaba.fastjson.JSONObject;
import com.swingfrog.summer.annotation.Remote;
import com.swingfrog.summer.web.view.JSONView;

@Remote
public class UserRemote {
    public JSONView add(String name, Integer age) {
        JSONObject json = new JSONObject();
        json.put("name",name);
        json.put("age", age);
        return new JSONView(json);
    }
}
