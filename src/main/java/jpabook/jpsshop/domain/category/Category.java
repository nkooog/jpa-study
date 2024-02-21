package jpabook.jpsshop.domain.category;

import jakarta.persistence.*;
import jpabook.jpsshop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "category_item"
            ,  joinColumns = @JoinColumn(name = "category_id")
            ,  inverseJoinColumns = @JoinColumn(name = "item_id")
    ) // 중간 테이블 조인
    private List<Item> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();
}
