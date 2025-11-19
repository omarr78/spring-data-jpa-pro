package com.alibou.jpa.entity.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_order")
public class Order {
    @EmbeddedId
    private OrderId id;
    @Embedded
    private Address address;
    private String orderInfo;
    private String anotherField;
}
