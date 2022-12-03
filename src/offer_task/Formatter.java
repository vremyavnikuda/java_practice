package offer_task;

import java.util.concurrent.atomic.AtomicInteger;

public enum Formatter {
    XML,JSON, YAML;

    private final AtomicInteger count = new AtomicInteger(0);

    public int format(String src) {
        count.incrementAndGet();
        return Formatter.JSON.getCount();
    }

    public int getCount() {
        return count.get();
    }
}
