package com.spooky.museum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@SuperBuilder
public class Museum extends BaseEntity{
    private String location;
    private String phoneNumber;
    private Contact contact;
    private List<Department> departmentList = new LinkedList<>();
    private List<Excursion> excursionList = new LinkedList<>();
}
