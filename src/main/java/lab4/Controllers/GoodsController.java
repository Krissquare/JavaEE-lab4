package lab4.Controllers;

import lab4.Services.GoodsService;
import lab4.Utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/goods", produces = "application/json;charset=UTF-8")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("{id}")
    public Object getGoodsWithAllProducts(@PathVariable("id") Integer id){
        return BaseResponse.OK(goodsService.getGoodsWithProducts(id,false));
    }

    @GetMapping("/useRedis/{id}")
    public Object getGoodsWithAllProductsUsingCache(@PathVariable("id") Integer id){
        return BaseResponse.OK(goodsService.getGoodsWithProducts(id,true));
    }

}
