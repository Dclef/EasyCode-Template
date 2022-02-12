package com.example.demoplus.basic.service.impl;

import com.example.demoplus.basic.mapper.BaseMapper;

import com.example.demoplus.basic.query.BaseQuery;
import com.example.demoplus.basic.service.IBaseService;
import com.example.demoplus.basic.until.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * impl层
 * @author dclef
 * @since 2022-02-12 09:44:05
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired(required = false)
    private BaseMapper<T> mapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public T queryById(Long id) {
        return mapper.queryById(id);
    }

    /**
     * 查询指定行数据
     *
     * @param query 查询条件
     * @return 对象列表
     */
    @Override
    public PageList<T> page(BaseQuery query) {
        // 查询当前页的数据
        List<T> rows = mapper.query(query);
        //查询总条数
        Long total = mapper.count(query);
        //查询成功的信息
        return new PageList<>(total, rows);
    }

    /**
     * 查询所有
     *
     * @return 对象列表
     */
    @Override
    public List<T> queryAll() {
        return mapper.queryAll();
    }



    /**
     * 新增数据
     *
     * @param t 实例对象
     */
    @Transactional
    @Override
    public void insert(T t) {
        mapper.insert(t);
    }

    /**
     * 修改数据
     *
     * @param t 实例对象
     */
    @Transactional
    @Override
    public void update(T t) {
        mapper.update(t);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     */
    @Override
    public boolean deleteById(Long id) {
        return mapper.deleteById(id) ;
    }

    /**
     * 批量删除数据
     *
     * @param ids ids
     * @return 影响行数
     */

    @Override
    public boolean deletePatch(List<Long> ids) {
        return mapper.deletePatch(ids);
    }
}

