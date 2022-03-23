package icu.dclef.springboottemplate.until;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
/**
 * 分页工具类
 *
 * @author makejava
 * @since 2022-03-23 23:14:08
 */
@Data
//全参数构造器
@AllArgsConstructor
//无参构造器
@NoArgsConstructor
public class PageList<T> {
    /**
     * 计算总条数
     */
    private  Long total;
   
    /**
     * 列表展示
     */
    private  List<T> rows=new ArrayList<>();

}
