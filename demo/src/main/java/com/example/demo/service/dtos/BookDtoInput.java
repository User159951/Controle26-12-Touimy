package com.example.demo.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookDtoInput {
    private String titre;
    private  String publisher;
    private Date datePublication;
    private float price;
    private String resume;
}

