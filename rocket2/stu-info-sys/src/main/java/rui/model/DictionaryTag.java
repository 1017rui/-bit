package rui.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class DictionaryTag {
    private Integer id;
    //需要使用包装数据类型，为什么？
    //new对象的时候，基本数据类型的默认值可能会出现问题。
    private String dictionaryTagKey;
    private String dictionaryTagValue;
    private String dictionaryTagDesc;
    private Integer dictionaryId;
    //一般日期类型使用java.util.Date和数据库映射，默认的映射是java.sql.xxx
    private Date createTime;


}
