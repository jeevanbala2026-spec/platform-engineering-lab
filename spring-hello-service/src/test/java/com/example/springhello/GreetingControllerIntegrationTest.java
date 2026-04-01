package com.example.springhello;

import com.example.springhello.web.GreetingResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void helloEndpointReturnsGreeting() {
        ResponseEntity<GreetingResponse> response =
                restTemplate.getForEntity("/api/hello?name=Jeeva", GreetingResponse.class);

        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().message()).isEqualTo("Hello, Jeeva!");
        assertThat(response.getBody().status()).isEqualTo("OK");
    }

    @Test
    void healthEndpointReturnsUp() {
        ResponseEntity<GreetingResponse> response =
                restTemplate.getForEntity("/api/health", GreetingResponse.class);

        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().status()).isEqualTo("UP");
    }
}
