package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.domain.상품구매됨;
import untitled.domain.상품상세정보확인됨;
import untitled.domain.의류상품검색됨;
import untitled.domain.주문상태조회됨;
import untitled.소비자관리Application;

@Entity
@Table(name = "의류상품_table")
@Data
//<<< DDD / Aggregate Root
public class 의류상품 {

    @Id
    private String 이름;

    private Money 가격;

    private Integer 재고량;

    private String 상세설명;

    @PostPersist
    public void onPostPersist() {
        의류상품검색됨 의류상품검색됨 = new 의류상품검색됨(this);
        의류상품검색됨.publishAfterCommit();

        상품상세정보확인됨 상품상세정보확인됨 = new 상품상세정보확인됨(this);
        상품상세정보확인됨.publishAfterCommit();

        상품구매됨 상품구매됨 = new 상품구매됨(this);
        상품구매됨.publishAfterCommit();

        주문상태조회됨 주문상태조회됨 = new 주문상태조회됨(this);
        주문상태조회됨.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static 의류상품Repository repository() {
        의류상품Repository 의류상품Repository = 소비자관리Application.applicationContext.getBean(
            의류상품Repository.class
        );
        return 의류상품Repository;
    }
}
//>>> DDD / Aggregate Root
