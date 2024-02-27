package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "hotmail.com", "yandex.ru");
        return emails.stream()
                .map(email -> {
                    var emailSplit = email.split("@");
                    var domain = emailSplit[1].toLowerCase();
                    return domain;
                })
                .filter(domain -> freeDomains.contains(domain))
                .collect(Collectors.counting());
    }
}
// END
