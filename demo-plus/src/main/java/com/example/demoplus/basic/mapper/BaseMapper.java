package com.example.demoplus.basic.mapper;

import com.example.demoplus.basic.query.BaseQuery;

import java.util.List;

/**
 * mapper层
 * @author dclef
 * @since 2022-02-12 09:33:22
 */

public interface BaseMapper<T> {
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
    List<T> query(BaseQuery query);


    /**
     * 查询所有
     * @return 对象列表
     */
    List<T> queryAll();

    /**
     * 统计总行数
     *
     * @param query 查询条件
     * @return 总行数
     */
    long count(BaseQuery query);

    /**
     * 新增数据
     *
     * @param T 实例对象
     */
    void insert(T T);


    /**
     * 修改数据
     *
     * @param T 实例对象
     */
    void update(T T);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     */
    boolean deleteById(Long id);

    /**
     * 批量删除数据
     * @param ids ids
     * @return 影响行数
     */
    boolean deletePatch(List<Long> ids);

}

