package mall; //대문자가 되면 안 됨.

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ordercancelled extends AbstractEvent {

    private String stateMessage = "주문이 취소됨";

    private Long id;
    private String productId;
    private Integer qty;
    private String status;

    public Ordercancelled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}