import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {

    public static void main(String[] args) {

// ["Bartek", "Antek", "Tomek", "Filip", "Romek", "Franek", "Artur", "Feliks"] -> stream
// wyszukaj imiona, które zaczynają się na F -> stream ["Filip", "Franek", "Feliks"]
// wyszukaj imiona, które zawierają literę k -> stream ["Franek", "Feliks"]
// wyszukaj imiona, które kończą się na literę s -> stream ["Feliks"]
// wyświetl wszytskie elementy

//        List<String> names = new ArrayList<>();
//
//        names.add("Bartek");
//        names.add("Antek");
//        names.add("Tomek");
//        names.add("Filip");
//        names.add("Romek");
//        names.add("Franek");
//        names.add("Artur");
//        names.add("Feliks");
//        names.add("Max");
//        names.add("Franek");

//        LEKCJA 1
//        names.stream()
//                .filter(str -> str.startsWith("F"))
//                .filter(str -> str.contains("k"))
//                .filter(str -> str.endsWith("s"))
//                .forEach(str -> System.out.println(str));

//        LEKCJA 2
//        System.out.println("---Test 1---");
//        names.stream()
//                .map(str -> str.replace("Feliks", "Arek"))
//                .map(str -> str.toUpperCase())
//                .forEach(str -> System.out.println(str));
//
//        System.out.println("---Test 2---");
//        names.stream()
//                .filter(str -> str.length() <= 3)
//                .map(str -> str.toUpperCase())
//                .map(str -> "Short name: " + str)
//                .forEach(str -> System.out.println(str));
//
//        System.out.println("---Test 3---");
//        long count = names.stream()
//                .filter(str -> str.startsWith("F"))
//                .count();
//        System.out.println(count);

//        LEKCJA 3

//        System.out.println("---Test 1 ---");
//        boolean anyMatch = names.stream()
//                .anyMatch(s -> s.contains("c"));
//        System.out.println(anyMatch);
//
//        System.out.println("---Test 2 ---");
//        boolean allMatch = names.stream()
//                .allMatch(s -> s.length() > 2);
//        System.out.println(allMatch);
//
//        System.out.println("---Test 3 ---");
//        boolean noneMatch = names.stream()
//                .noneMatch(s -> s.endsWith("ek"));
//        System.out.println(noneMatch);
//
//        System.out.println("---Test 4 ---");
//        List<String> newList = names.stream()
//                .filter(s -> s.endsWith("ek"))
//                .collect(Collectors.toList());
//        System.out.println(newList);
//
//        System.out.println("---Test 5 ---");
//        Set<String> newSet = names.stream()
//                .filter(s -> s.startsWith("F"))
//                .collect(Collectors.toSet());
//        System.out.println(newSet);

//        LEKCJA 4

        List<User> users = new ArrayList<>();

        users.add(new User("Rafaela", "Testowa", "wp@com.pl", 25));
        users.add(new User("Anna", "Nowa", "onet@com.pl", 20));
        users.add(new User("Michał", "Nowak", "interia@com.pl", 30));
        users.add(new User("Michał", "Biały", "interia@com.pl", 30));
        users.add(new User("Tomek", "Polny", "gmial@com.pl", 35));

//        List<User> sortedUsers = users.stream()
//                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName))
//                .collect(Collectors.toList());
//
//        for (User user : sortedUsers) {
//            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
//        }

//        users.stream()
//                .sorted(Comparator.comparing(User::getFirstName))
//                .forEach(System.out::println);

//        LEKCJA 5

//        Optional<User> max = users.stream()
//                .max(Comparator.comparingInt(User::getAge));
//
//        System.out.println(max.get());
//        System.out.println(max.isPresent());
//
//        if (max.isPresent()) {
//            System.out.println(max.get());
//        } else {
//            System.out.println("Nie ma takiego obiektu");
//        }

//        LEKCJA 6

//        String names = users.stream()
//                .map(User::getFirstName)
//                .filter(s -> s.equals("Michał"))
//                .findFirst()
//                .orElse("Brak obiektu na liście");
//        System.out.println(names);
//
//        Integer max = users.stream()
//                .map(User::getAge)
//                .max(Integer::compareTo)
//                .orElse(-1);
//        System.out.println(max);

//        BŁĄD!!!
//        Integer max = users.stream()
//                .map(User::getAge)
//                .max(Comparator.comparingInt(User::getAge))
//                .orElse(-1);
//        System.out.println(max);

//        LEKCJA 7

//        System.out.println("---orElseGet---");
//        User newUser = users.stream()
//                .filter(user -> user.getFirstName().startsWith("M")) //wyszkuje usera na "M"
//                .findFirst() // zwraca pierwszego napotkanego usera, a jeśli nie ma to tworzy nowego usera
//                .orElseGet(() -> new User("Michałnew", "Test", "onet@wp.pl", 25));
//        System.out.println(newUser);
//
//        System.out.println("---orElseThrow---");
//        User newUserTwo = users.stream()
//                .filter(user -> user.getFirstName().startsWith("M")) //wyszkuje usera na "M"
//                .findFirst() // zwraca pierwszego napotkanego usera, a jeśli nie ma to tworzy nowego usera
//                .orElseThrow(() -> new IllegalStateException("Na liście nie ma usera spełniącego odpowiednie warunki"));
//        System.out.println(newUserTwo);

//        LEKCJA 8

//        System.out.println("---ifPresent---");
//        users.stream()
//                .filter(u -> u.getFirstName().startsWith("M"))
//                .findFirst()
//                .ifPresent(u -> System.out.println(u));
//
//        System.out.println("---ifPresentOrElse---");
//        users.stream()
//                .filter(u -> u.getFirstName().startsWith("M"))
//                .findFirst()
//                .ifPresentOrElse(u -> System.out.println(u), () -> System.out.println("Brak obiektu"));




    }
}
