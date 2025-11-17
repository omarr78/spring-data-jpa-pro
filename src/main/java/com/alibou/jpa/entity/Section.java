package com.alibou.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Section extends BaseEntity {
    private String name;
    private int sectionOrder;

    @ManyToOne // many sections to one course
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "section") // one section to many lectures
    private List<Lecture> lectures;
}