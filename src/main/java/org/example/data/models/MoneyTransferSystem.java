package org.example.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class MoneyTransferSystem {

    @JsonProperty("mtSystem")
    private String mtSystem;

    @JsonProperty("name")
    private String name;

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("currencies")
    private List<String> currencies;
}