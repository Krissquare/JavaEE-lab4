package lab4.Mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {

    public Object selectGoodsWithProducts(Integer id);

}
