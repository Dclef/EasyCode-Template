package com.example.demoplus.basic.service;


import com.example.demoplus.basic.query.BaseQuery;
import com.example.demoplus.basic.until.PageList;


import java.util.List;

/**
 * service层
 * @author dclef
 * @since 2022-02-12 09:44:05
 */

public interface IBaseService<T> {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    T queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param query 查询条件
     * @return 对象列表
     */
    PageList<T> page(BaseQuery query);


    /**
     * 查询所有
     * @return 对象列表
     */
    List<T> queryAll();


    /**
     * 新增数据
     *
     * @param t 实例对象
     */
    void insert(T t);


    /**
     * 修改数据
     *
     * @param t 实例对象
     */
    void update(T t);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return id
     */
    boolean deleteById(Long id);

    /**
     * 批量删除数据
     * @param ids ids
     * @return 影响行数
     */
    boolean deletePatch(List<Long> ids);

}

