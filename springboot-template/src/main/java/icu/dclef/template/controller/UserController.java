package icu.dclef.template.controller;

import icu.dclef.template.entity.User;
import icu.dclef.template.query.UserQuery;
import icu.dclef.template.service.UserService;
import icu.dclef.template.util.AjaxResult;
import icu.dclef.template.util.PageList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-08-30 16:57:20
 */
@Api(tags = "模块")
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.GET, produces = "application/json")
    public PageList<User> page(UserQuery query) {
        return userService.queryPage(query);
    }

    /**
     * 查询所有
     *
     * @return 查询结果
     */
    @ApiOperation(value = "查询所有")
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public List<User> list() {
        return this.userService.queryAll();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询单条数据")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<User> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增或删除数据
     *
     * @param user 实体
     */
    @ApiOperation(value = "新增或删除")
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public AjaxResult addOrUpdate(User user) {
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


    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public AjaxResult deleteById(@PathVariable("id") Long id) {
        if (this.userService.deleteById(id)) {
            return AjaxResult.ok();
        } else {
            return AjaxResult
                    .ok()
                    .setSuccess(false)
                    .setMessage("操作失败，请重试");
        }
    }

}

