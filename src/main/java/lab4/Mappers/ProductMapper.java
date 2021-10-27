package lab4.Mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {

    public Object getProductSKUInfo(@Param("id") Integer id);

}
