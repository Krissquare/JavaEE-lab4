package lab4.Services;

import lab4.Mappers.ProductMapper;
import lab4.Models.Product;
import lab4.Utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    private RedisUtils redisUtils;

    @Value("${javaeelab4.product.expiretime}")
    private long queryTimeOut;

    public Object getProductSKUInfo(Integer id){
        Product product = (Product) redisUtils.get(id.toString());
        if (product != null){
            return  product;
        }
        product = (Product) productMapper.getProductSKUInfo(id);
        redisUtils.set(id.toString(),product,queryTimeOut);
        return product;
    }

}
