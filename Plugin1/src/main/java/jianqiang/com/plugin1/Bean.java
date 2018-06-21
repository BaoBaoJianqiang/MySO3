package jianqiang.com.plugin1;

import com.example.jianqiang.mypluginlibrary.IBean;
import com.example.jianqiang.mypluginlibrary.ICallback;
import com.jianqiang.jnihelloworld.JniUtils;

public class Bean implements IBean {
    private String name = "jianqiang";

    private ICallback callback;

    @Override
    public String getName() {
        return new JniUtils().getString();
    }

    @Override
    public void setName(String paramString) {
        this.name = paramString;
    }

    @Override
    public void register(ICallback callback) {
        this.callback = callback;
    }
}
