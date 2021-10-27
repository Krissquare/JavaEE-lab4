package Mappers;

import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

    public Object getProductSKUInfo(@Param("id") Integer id);

}
