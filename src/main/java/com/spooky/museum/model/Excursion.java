package com.spooky.museum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@SuperBuilder
public class Excursion extends BaseEntity{
    private String description;
    private Guide mainGuide;
    private List<User> group = new LinkedList<>();
    private List<Lecture> lectures= new LinkedList<>();
}
