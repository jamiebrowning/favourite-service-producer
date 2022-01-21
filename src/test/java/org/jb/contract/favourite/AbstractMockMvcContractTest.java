package org.jb.contract.favourite;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public abstract class AbstractMockMvcContractTest {

	@BeforeEach
	void setUp() {
		RestAssuredMockMvc.standaloneSetup(new FavouriteController(request -> Boolean.TRUE));
	}

}
