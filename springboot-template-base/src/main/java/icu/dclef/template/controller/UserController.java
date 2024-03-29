package icu.dclef.template.controller;


import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import icu.dclef.template.base.controller.BaseController;
import icu.dclef.template.base.util.AjaxResult;
import icu.dclef.template.entity.User;
import icu.dclef.template.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-08-30 17:23:14
 */
@Api(tags = "模块")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 增加或修改数据
     *
     * @return 编辑结果
     */
    @ApiOperation(value = "增加或修改")
    //忽略请求参数id
    @ApiOperationSupport(ignoreParameters = {"id"})
    @PutMapping
    public AjaxResult insertOrUpdate(User user) {
        try {
            if (user.getId() == null) {
                userService.insert(user);
            } else {
                userService.update(user);
            }
            return AjaxResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult
                    .ok()
                    .setSuccess(false)
                    .setMessage("系统错误,请重试");
        }
    }
}


