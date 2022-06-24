package cooperation.bus.domain.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Area {
    @Id @GeneratedValue
    private Long id;
    private String tx;
    private String ty;
    //api에서 위치를 보고 넣어야한다.
}