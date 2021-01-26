package Telephony;
import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> number, List<String> urls) {
        this.numbers = number;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url: urls) {
            if (url.matches(".*\\d.*")) {
                sb.append("Invalid URL!");
            } else {
                sb.append(String.format("Browsing: %s!", url));
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number: numbers) {
            if (number.matches("[0-9]+")) {
                sb.append(String.format("Calling... %s", number));
            } else {
                sb.append("Invalid number!");
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}