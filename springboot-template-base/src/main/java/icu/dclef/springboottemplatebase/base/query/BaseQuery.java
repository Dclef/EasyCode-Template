package icu.dclef.springboottemplatebase.base.query;


import lombok.Data;

/**
 * 分页+高级查询
 * @author makejava
 * @since 2022-03-23 23:32:29
 */
@Data
public class BaseQuery {
    /**
     * 当前页面
     */
    private Integer currentPage = 1;
    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 计算分页开始索引
     * @return {@link Integer}
     */
    public Integer getBeginIndex() {
        return (this.currentPage - 1) * pageSize;
    }

}

