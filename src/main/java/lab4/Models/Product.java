package lab4.Models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {

    private Integer id;
    private String name;
    private String skuSn;
    private String detail;
    private String imageUrl;
    private Integer originalPrice;
    private Integer price;
    private Integer inventory;
    private Integer state;
    private Integer weight;
    private String gmtCreate;
    private String gmtModified;
    private Goods goods;
    private Boolean disable;
    private Boolean shareable;

}
