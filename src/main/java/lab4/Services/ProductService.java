package lab4.Services;

import lab4.DAO.ProductDao;
import lab4.Mappers.ProductMapper;
import lab4.Models.Product;
import lab4.Utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Object getProductSKUInfo(Integer id, Boolean useCache){
        if (useCache == false)
            return productDao.getProductSKUInfo(id);
        else
            return productDao.getProductSKUInfoWithCache(id);
    }

}
