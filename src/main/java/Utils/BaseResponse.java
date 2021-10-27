package Utils;

import lombok.Data;

@Data
public class BaseResponse {
    private Integer errno;
    private String errmsg;
    private Object data;

    public BaseResponse(Integer errno, String errmsg, Object data) {
        this.errno = errno;
        this.errmsg = errmsg;
        this.data = data;
    }

    public static BaseResponse OK(Object data){
        return new BaseResponse(0,"成功",data);
    }

}
