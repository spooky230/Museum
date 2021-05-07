package com.spooky.museum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Department extends BaseEntity{
    private Contact contact;
    private String description;
    private List<Guide> guides = new LinkedList<>();
}
