package jpabook.jpsshop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B") // 구분 값
@Getter @Setter
public class Book extends Item{

    private String author;
    private String ibsn;

}
