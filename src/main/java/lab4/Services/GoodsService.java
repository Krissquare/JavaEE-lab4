package lab4.Services;

import lab4.DAO.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    public Object getGoodsWithProducts(Integer id, Boolean useCache){
        if (useCache)   return goodsDao.getGoodsWithProductsUsingRedis(id);
        else return goodsDao.getGoodsWithProducts(id);
    }

}
