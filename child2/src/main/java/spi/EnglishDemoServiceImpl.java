package spi;

public class EnglishDemoServiceImpl implements DemoService {
    @Override
    public String sayHi(String msg) {
        return "hello" + msg;
    }
}
