package icu.dclef.demo.mapper;

import icu.dclef.demo.entity.User;
import icu.dclef.demo.query.UserQuery;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author dclef
 * @since 2022-02-05 17:29:40
 */
public interface UserMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);
      /**
     * 查询所有
     * @return 对象列表
     */
    List<User> queryAll();

    /**
     * 查询指定行数据
     *
     * @param  query 查询条件
     * @return 对象列表
     */
    List<User> query(UserQuery query);

    /**
     * 统计总行数
     *
     * @param query 查询条件
     * @return 总行数
     */
    long count(UserQuery query);

    /**
     * 新增数据
     *
     */
    void insert(User user);


  
    /**
     * 修改数据
     *
     */
    void update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

