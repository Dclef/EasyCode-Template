package icu.dclef.demo.until;
import lombok.Data;

/**
 * ajax请求的返回对象
 */
@Data
public class AJaxResult {
    private Boolean success = true;
    private String message = "操作成功！！";

    public static AJaxResult ok(){
        return new AJaxResult();
    }


    public AJaxResult setSuccess(Boolean success) {
        this.success = success;
        //返回当前线程操作的对象
        return this;
    }

    public AJaxResult setMessage(String message) {
        this.message = message;
        //返回当前线程操作的对象
        return this;
    }
}

