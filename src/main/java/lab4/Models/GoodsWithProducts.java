package lab4.Models;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class GoodsWithProducts implements Serializable {
    private Integer id;
    private String name;
    private ArrayList<Product> products;
}
