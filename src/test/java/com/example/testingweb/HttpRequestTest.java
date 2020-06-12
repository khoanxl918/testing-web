package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate restTemplate;

    /**
     * in this test, server is started and waiting for a connection, then we send a request and analyse the response
     * just as in real case.
     * @throws Exception
     */
    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(
                this.restTemplate.getForObject("http://localhost:" + port + "/", String.class))
                .contains("Hello, World!");
    }
}
