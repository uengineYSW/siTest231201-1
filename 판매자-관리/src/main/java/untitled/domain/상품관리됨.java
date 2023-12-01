package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 상품관리됨 extends AbstractEvent {

    public 상품관리됨(상품관리 aggregate) {
        super(aggregate);
    }

    public 상품관리됨() {
        super();
    }
}
//>>> DDD / Domain Event
