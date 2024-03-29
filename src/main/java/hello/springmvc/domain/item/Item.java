package hello.springmvc.domain.item;

import lombok.Data;
// 위험, 되도록 setter, getter 등 필요한 것 불러와서 사용하기
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

     public Item(String itemName, Integer price, Integer quantity) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
