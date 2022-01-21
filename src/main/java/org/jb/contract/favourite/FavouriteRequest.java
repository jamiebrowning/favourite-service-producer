package org.jb.contract.favourite;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FavouriteRequest {
    private String userKey;
    private String userValue;
    private String itemKey;
    private String itemValue;
}
