package Services;

import Mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    ProductMapper productMapper;

    public Object getProductSKUInfo(Integer id){
        return productMapper.getProductSKUInfo(id);
    }

}
