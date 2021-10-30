package lab4.DAO;

import lab4.Mappers.GoodsMapper;
import lab4.Models.GoodsWithProducts;
import lab4.Utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDao {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private RedisUtils redisUtils;

    @Value("${javaeelab4.product.expiretime}")
    private long queryTimeOut;

    public Object getGoodsWithProducts(Integer id){
        return goodsMapper.selectGoodsWithProducts(id);
    }

    public Object getGoodsWithProductsUsingRedis(Integer id){
        GoodsWithProducts gwp = (GoodsWithProducts) redisUtils.get(id.toString());
        if (gwp==null){
            gwp = (GoodsWithProducts) goodsMapper.selectGoodsWithProducts(id);
            redisUtils.set(id.toString(),gwp,queryTimeOut);
        }
        return gwp;
    }

}
