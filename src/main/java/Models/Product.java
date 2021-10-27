package Models;

import lombok.Data;

@Data
public class Product {

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
