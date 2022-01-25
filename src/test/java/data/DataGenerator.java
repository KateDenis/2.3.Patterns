package data;

import com.github.javafaker.Country;
import com.github.javafaker.Faker;
import lombok.Data;
import lombok.experimental.UtilityClass;
import java.util.Locale;

@UtilityClass
public class DataGenerator {

    @UtilityClass
    public static class Registration {
        public static UserInfo getUserInfo(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new UserInfo(faker.address().cityName(),
                    faker.name().fullName(),
                    faker.phoneNumber().phoneNumber());
        }
    }

    @Data
    public static class UserInfo {
        private final String city;
        private final String name;
        private final String phone;
    }
}
