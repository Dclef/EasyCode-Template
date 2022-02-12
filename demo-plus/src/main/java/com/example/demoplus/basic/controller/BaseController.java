package com.example.demoplus.basic.controller;


import com.example.demoplus.basic.query.BaseQuery;
import com.example.demoplus.basic.until.AjaxResult;
import com.example.demoplus.basic.until.PageList;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author dclef
 * @since 2022-02-12 09:33:22
 */
public class BaseController<T> {
    @Autowired(required=false)
    private com.example.demoplus.basic.service.IBaseService<T> baseService;


    @ApiOperation(value = "查询所有数据")
    @GetMapping("/list")
    public List<T> queryAll() {
        return baseService.queryAll();
    }

    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    @ApiOperation(value = "分页查询")
    @PostMapping("/page")
    public PageList<T> list(BaseQuery query) {
        return baseService.page(query);

    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询单条数据")
    @PostMapping("/{id}")
    public ResponseEntity<T> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.baseService.queryById(id));
    }


    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/{id}")
    public AjaxResult deleteById(@PathVariable("id") Long id) {
        if (this.baseService.deleteById(id)){
            return   AjaxResult.ok();
        }else {
            return AjaxResult
                    .ok()
                    .setSuccess(false)
                    .setMessage("操作失败");
        }
    }
    @ApiOperation(value = "批量删除")
    @PatchMapping
    public AjaxResult deletePatch(@RequestBody List<Long>ids) {
        if (this.baseService.deletePatch(ids)){
            return   AjaxResult.ok();
        }else {
            return AjaxResult
                    .ok()
                    .setSuccess(false)
                    .setMessage("操作失败");
        }
    }

//    /**
//     * 新增数据
//     *
//     * @param t 实体
//     * @return 新增结果
//     */
//    @ApiOperation(value = "新增")
//    @PostMapping
//    public AjaxResult add(T t) {
//        this.baseService.insert(t);
//        return AjaxResult.ok();
//    }
//    /**
//     * 编辑数据
//     *@param t 实体
//     * @return 编辑结果
//     */
//    @ApiOperation(value = "修改")
//    @PutMapping
//    public AjaxResult edit(T t) {
//        this.baseService.update(t);
//        return AjaxResult.ok();
//    }



//    /**
//     * 增加或修改数据
//     *
//     * @param t 实体
//     * @return 编辑结果
//     */
//    @OperLog(operModul = "增加或修改数据", operType = "insertOrUpdate", operDesc = "增加或修改数据测试")
//    @ApiOperation(value = "增加或修改")
//    @PutMapping
//    public AjaxResult insertOrUpdate(@RequestBody TDepartment tDepartment) {
//        try {
//            if (tDepartment.getId()==null){
//                tDepartmentService.insert(tDepartment);
//            }else {
//                tDepartmentService.update(tDepartment);
//            }
//            return AjaxResult.ok();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return AjaxResult
//                    .ok()
//                    .setSuccess(false)
//                    .setMessage("系统错误,请重试");
//        }
//    }
}

