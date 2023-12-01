package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 상품상세정보확인됨 extends AbstractEvent {

    public 상품상세정보확인됨(의류상품 aggregate) {
        super(aggregate);
    }

    public 상품상세정보확인됨() {
        super();
    }
}
//>>> DDD / Domain Event
