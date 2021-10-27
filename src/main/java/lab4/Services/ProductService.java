package lab4.Services;

import lab4.Mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductMapper productMapper;

    public Object getProductSKUInfo(Integer id){
        return productMapper.getProductSKUInfo(id);
    }

}
