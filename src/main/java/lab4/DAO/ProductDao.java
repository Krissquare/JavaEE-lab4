package lab4.DAO;

import lab4.Mappers.ProductMapper;
import lab4.Models.Product;
import lab4.Utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    private RedisUtils redisUtils;

    @Value("${javaeelab4.product.expiretime}")
    private long queryTimeOut;

    public Object getProductSKUInfoWithCache(Integer id){
        Product product = (Product) redisUtils.get(id.toString());
        if (product != null){
            return  product;
        }
        //暂时使用这样的缓存逻辑，肯定是有问题的。有点困，明天改
        //TODO: optimize redis cache
        product = (Product) productMapper.getProductSKUInfo(id);
        redisUtils.set(id.toString(),product,queryTimeOut);
        return product;
    }

    public Object getProductSKUInfo(Integer id){
        return productMapper.getProductSKUInfo(id);
    }
}
