package icu.dclef.springboottemplate.query;
import lombok.Data;

/**
 * (User)高级查询+分页
 *
 * @author makejava
 * @since 2022-03-23 23:14:08
 */
@Data
public class  UserQuery  {
    /**
     * 当前页面
     */
    private Integer currentPage=1;
    /**
     * 页面大小
     */
    private Integer pageSize=10;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 得到开始指数
     *
     * @return {@link Integer}
     *///计算分页开始索引
    public Integer getBeginIndex(){
        return (this.currentPage-1)*pageSize;
    }

}

