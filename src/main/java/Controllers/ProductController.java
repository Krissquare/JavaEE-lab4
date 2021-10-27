package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/products")
public class ProductController {

    @GetMapping("{id}")
    public Object getCompleteInformationOfSKU(@PathVariable("id") Integer id){

        return null;
    }

}
