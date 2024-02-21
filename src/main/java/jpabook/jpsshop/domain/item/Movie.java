package jpabook.jpsshop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("M") // 구분 값
@Getter @Setter
public class Movie extends Item{

    private String director;
    private String actor;

}
