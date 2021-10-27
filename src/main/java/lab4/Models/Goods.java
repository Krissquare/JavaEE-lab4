package lab4.Models;

import lombok.Data;

@Data
public class Goods {

    private Integer id;
    private String name;
    private String goodsSn;
    private String imageUrl;
    private Integer state;
    private String gmtCreate;
    private String gmtModified;
    private Boolean disable;

}
