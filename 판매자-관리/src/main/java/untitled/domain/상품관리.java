package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.domain.상품등록됨;
import untitled.판매자관리Application;

@Entity
@Table(name = "상품관리_table")
@Data
//<<< DDD / Aggregate Root
public class 상품관리 {

    @Id
    private String 상품명;

    private Money 가격;

    private Integer 재고량;

    private String 상세설명;

    @PostPersist
    public void onPostPersist() {
        상품등록됨 상품등록됨 = new 상품등록됨(this);
        상품등록됨.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static 상품관리Repository repository() {
        상품관리Repository 상품관리Repository = 판매자관리Application.applicationContext.getBean(
            상품관리Repository.class
        );
        return 상품관리Repository;
    }

    //<<< Clean Arch / Port Method
    public void 상품수정() {
        //implement business logic here:

        상품관리됨 상품관리됨 = new 상품관리됨(this);
        상품관리됨.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
