package com.kodilla.testing.sample;

public class MyService {

    private MyRepository myRepository;
    private OtherService otherService;

    public MyService(MyRepository myRepository, OtherService otherService) {
        this.myRepository = myRepository;
        this.otherService = otherService;
    }

    int doSth(int i) {
        int j = myRepository.save();

        int result = j + i;

        return result;
    }

    int doSthElse() {
        return otherService.methodA() + otherService.methodB();
    }

    void sendDataToExternalService(String input) {

        /**
         *
         */
        input = input + "123";
        /***
         *
         */
        otherService.sendData(input);
    }

}
