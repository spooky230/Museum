package com.spooky.museum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@SuperBuilder
public class Lecture {
    private Date startTime;
    private Date endTime;
    private String subject;
    private Guide lecturer;
}
