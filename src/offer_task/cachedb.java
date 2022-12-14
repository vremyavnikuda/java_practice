package offer_task;

import java.util.Optional;

public class Account {
    public static void main(String[] args) {
        long id = 15L;
        Account acc = getFromCache(id).orElse(getFromDB(id));
        System.out.println(acc.getId());
    }

    public static Optional<Account> getFromCache(long id) {
        System.out.println("CACHE");
        return ...;
    }

    public static Account getFromDB(long id) {
        System.out.println("DB");
        return ...;
    }
    public T orElse(T other) {
        return value != null ? value : other;
    }
}

