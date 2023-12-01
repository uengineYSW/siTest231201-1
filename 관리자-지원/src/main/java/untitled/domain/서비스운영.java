package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.domain.결제관리됨;
import untitled.domain.고객지원됨;
import untitled.domain.서비스운영됨;
import untitled.관리자지원Application;

@Entity
@Table(name = "서비스운영_table")
@Data
//<<< DDD / Aggregate Root
public class 서비스운영 {

    @Id
    private String 서비스명;

    @PostPersist
    public void onPostPersist() {
        서비스운영됨 서비스운영됨 = new 서비스운영됨(this);
        서비스운영됨.publishAfterCommit();

        고객지원됨 고객지원됨 = new 고객지원됨(this);
        고객지원됨.publishAfterCommit();

        결제관리됨 결제관리됨 = new 결제관리됨(this);
        결제관리됨.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static 서비스운영Repository repository() {
        서비스운영Repository 서비스운영Repository = 관리자지원Application.applicationContext.getBean(
            서비스운영Repository.class
        );
        return 서비스운영Repository;
    }
}
//>>> DDD / Aggregate Root
