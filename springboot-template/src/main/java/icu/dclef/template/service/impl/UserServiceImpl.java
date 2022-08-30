package icu.dclef.template.service.impl;

import icu.dclef.template.entity.User;
import icu.dclef.template.mapper.UserMapper;
import icu.dclef.template.query.UserQuery;
import icu.dclef.template.util.PageList;
import icu.dclef.template.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-08-30 16:57:20
 */
@Service("userService")
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userMapper.queryById(id);
    }

    /**
     * 查询所有
     *
     * @return 列表
     */
    @Override
    public List<User> queryAll() {
        return this.userMapper.queryAll();
    }

    /**
     * 分页查询
     *
     * @param query 筛选条件
     * @return 查询结果
     */
    @Override
    public PageList<User> queryPage(UserQuery query) {
        // 查询当前页的数据
        List<User> rows = userMapper.query(query);
        //查询总条数
        Long total = userMapper.count(query);

        return new PageList<>(total, rows);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     */
    @Override
    @Transactional
    public void insert(User user) {
        this.userMapper.insert(user);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     */
    @Override
    @Transactional
    public void update(User user) {
        this.userMapper.update(user);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userMapper.deleteById(id) > 0;
    }
}
