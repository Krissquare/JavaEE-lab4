package lab4.Controllers;

import lab4.Services.*;
import lab4.Utils.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products", produces = "application/json;charset=UTF-8")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("{id}")
    public Object getCompleteInformationOfSKU(@PathVariable("id") Integer id){
        Object result = productService.getProductSKUInfo(id);
        return BaseResponse.OK(result);
    }

}
