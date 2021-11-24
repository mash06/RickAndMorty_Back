package com.maria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    private Integer id;
    private String name;
    private Integer age;
    private Boolean hasOwner;
    private String imageUrl;
    private String breed;

}
