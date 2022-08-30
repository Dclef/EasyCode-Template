package icu.dclef.template.service;

import icu.dclef.template.entity.User;
import icu.dclef.template.query.UserQuery;
import icu.dclef.template.util.PageList;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-08-30 16:57:20
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);

    /**
     * 查询所有
     *
     * @return 对象列表
     */
    List<User> queryAll();

    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    PageList<User> queryPage(UserQuery query);

    /**
     * 新增数据
     */
    void insert(User user);

    /**
     * 修改数据
     */
    void update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
