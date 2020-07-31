package rui.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Student {
    private Integer id;
    private String studentName;
    private String studentNo;
    private String idCard;
    private String studentEmail;
    private String classesId;
    private Date createTime;

    private Classes classes;
}
