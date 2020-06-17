package com.kodilla.testing.sample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {

    @Mock
    MyRepository myRepository;

    @Spy
    OtherService otherService;

    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;

    @InjectMocks
    MyService myService;

    @Test
    public void testDoSth() {

        //Given
        when(myRepository.save()).thenReturn(100);

        //When
        double result = myService.doSth(10);

        //Then
        assertEquals(110, result, 0);
    }

    @Test
    public void doSthElse() {

        //Given
        when(otherService.methodB()).thenReturn(0);

        //When
        double result = myService.doSthElse();

        //Then
        assertEquals(100, result, 0);
    }

    @Test
    public void sendDataToExternalService() {

        //Given
        String input = "abc";

        //When
        myService.sendDataToExternalService(input);

        //Then
        verify(otherService, times(1)).sendData(stringArgumentCaptor.capture());
        String output = stringArgumentCaptor.getValue();
        assertEquals("abc123", output);
    }

}