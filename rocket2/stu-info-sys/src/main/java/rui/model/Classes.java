package rui.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Classes {
    private Integer id;
    private String classesName;
    private String classesGraduateYear;
    private String classesMajor;
    private String classesDesc;
    private Date createTime;
}
