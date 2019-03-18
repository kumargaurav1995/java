import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args){
        List<User> users = Arrays.asList(
                new User("Peter", 20,Arrays.asList("1","2")),
                new User("John", 30,Arrays.asList("3","5")),
                new User("Sam", 40,Arrays.asList("8","6"))
        );
        users.stream().filter(user -> !user.getName().equals("Sam")).forEach(System.out :: println );
        Optional<String> stringOptional = users.stream().filter(user -> !user.getName().equals("Sam")).map(user -> user.getPhoneNumber().stream()).flatMap(stringStream -> stringStream.filter(phone -> phone.equals("4"))).findAny();
        stringOptional.ifPresent(System.out ::println);
        List<Apple> apples = Arrays.asList(new Apple("yellow", 120.0), new Apple("pink", 110.0),
                new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
        Predicate<Apple> andPredicate = ApplePredicate.isWeightAbove150().and(ApplePredicate.isColorGreen()).negate();
        apples.stream().filter(andPredicate).collect(Collectors.toList()).forEach(System.out ::println);

    }
static class User{
        private String name;
        private Integer age;
        private List<String> phoneNumber;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, Integer age, List<String> phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name : " + name  +
                " age : " + age;
    }
}
}
