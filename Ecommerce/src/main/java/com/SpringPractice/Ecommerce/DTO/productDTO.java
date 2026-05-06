package com.SpringPractice.Ecommerce.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class productDTO {
    private Long prodID;
    private String prodName;
    private Double prodPrice;
}
