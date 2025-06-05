package com.industry.bank.api.dto.location;

import com.industry.bank.api.dto.Requester;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/05
 */
@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "AddAddressRequestDto")
public class AddAddressRequestDto extends Requester implements Serializable {
    private AddressDto address;
}
