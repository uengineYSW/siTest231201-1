package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 주문상태조회됨 extends AbstractEvent {

    public 주문상태조회됨(의류상품 aggregate) {
        super(aggregate);
    }

    public 주문상태조회됨() {
        super();
    }
}
//>>> DDD / Domain Event
