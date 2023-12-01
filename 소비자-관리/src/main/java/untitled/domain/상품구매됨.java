package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 상품구매됨 extends AbstractEvent {

    public 상품구매됨(의류상품 aggregate) {
        super(aggregate);
    }

    public 상품구매됨() {
        super();
    }
}
//>>> DDD / Domain Event
