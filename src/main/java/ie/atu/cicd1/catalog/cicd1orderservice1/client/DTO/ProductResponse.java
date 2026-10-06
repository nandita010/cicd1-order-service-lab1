package ie.atu.cicd1.catalog.cicd1orderservice1.client.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ProductResponse {

    private Long id;
    private String name;
    private BigDecimal price;
}
