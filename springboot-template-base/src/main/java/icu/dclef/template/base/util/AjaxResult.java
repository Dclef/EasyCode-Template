package icu.dclef.template.base.util;

import lombok.Data;

/**
 * ajax请求的返回对象
 */
@Data
public class AjaxResult {
    private Boolean success = true;
    private String message = "操作成功！！";

    public static AjaxResult ok() {
        return new AjaxResult();
    }


    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        //返回当前线程操作的对象
        return this;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        //返回当前线程操作的对象
        return this;
    }
}

