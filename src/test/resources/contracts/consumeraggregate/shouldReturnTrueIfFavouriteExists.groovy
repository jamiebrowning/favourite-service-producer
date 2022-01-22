package contracts.consumeraggregate

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url 'favourites/hasFavourite'
        body([
                "userKey" : "CONSUMER",
                "userValue" : "12345",
                "itemKey" : "INVENTORYITEM",
                "itemValue" : "67890"
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body(
            Boolean.TRUE
        )
        headers {
            contentType('application/json')
        }
    }
}
