package com.jz.aqjz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResults<T> {
    private Integer status;
    private String message;
    private T data;

    public CommonResults(Integer status, String message) {
        this(status, message, null);
    }
}
