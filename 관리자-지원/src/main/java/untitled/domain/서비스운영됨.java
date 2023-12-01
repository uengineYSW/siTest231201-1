package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 서비스운영됨 extends AbstractEvent {

    public 서비스운영됨(서비스운영 aggregate) {
        super(aggregate);
    }

    public 서비스운영됨() {
        super();
    }
}
//>>> DDD / Domain Event
