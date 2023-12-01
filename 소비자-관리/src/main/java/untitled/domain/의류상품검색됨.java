package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 의류상품검색됨 extends AbstractEvent {

    public 의류상품검색됨(의류상품 aggregate) {
        super(aggregate);
    }

    public 의류상품검색됨() {
        super();
    }
}
//>>> DDD / Domain Event
