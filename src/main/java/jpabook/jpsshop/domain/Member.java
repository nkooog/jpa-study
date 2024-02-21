package jpabook.jpsshop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") // mappedBy FK(Member 객체에 member)쪽으로 변경 설정
    private List<Order> orders = new ArrayList<>();
}
