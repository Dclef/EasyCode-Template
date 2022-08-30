package icu.dclef.template.base.service.impl;

import icu.dclef.template.base.mapper.BaseMapper;
import icu.dclef.template.base.query.BaseQuery;
import icu.dclef.template.base.service.IBaseService;
import icu.dclef.template.base.util.PageList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * impl层
 *
 * @author makejava
 * @since 2022-08-30 17:20:10
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
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
        return mapper.deleteById(id);
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

