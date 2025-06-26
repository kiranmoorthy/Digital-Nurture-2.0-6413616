package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceInteractionTest {

    @Test
    public void testVerifyInteraction(){
        ExternalApi mockapi =mock(ExternalApi.class);

        MyService service = new MyService(mockapi);

        service.fetchData();

        verify(mockapi).getData();
    }
}
