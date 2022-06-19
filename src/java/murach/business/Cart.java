package murach.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {

    private String code;
    private String des;
    private float price;
    public Cart() {
        code = "";
        des = "";
        price = 0;
    }

    public Cart(String code, String des, float price) {
        this.code = code;
        this.des = des;
        this.price = price;
       
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
}
