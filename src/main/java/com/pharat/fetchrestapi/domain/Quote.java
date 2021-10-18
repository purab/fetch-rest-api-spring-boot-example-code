package com.pharat.fetchrestapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private String value;

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
