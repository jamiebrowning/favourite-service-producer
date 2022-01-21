package org.jb.contract.favourite;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/favourites", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class FavouriteController {

    private final FavouriteService favouriteService;

    @PostMapping(value = "/hasFavourite")
    Boolean hasFavourite(@RequestBody FavouriteRequest request) {
        return favouriteService.hasFavourite(request);
    }
}
