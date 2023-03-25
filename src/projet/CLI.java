package projet;

import java.util.LinkedList;

public class CLI {
    private final List<Option> options = new LinkedList<>();
    private final Map<String, Action> actions = new HashMap<>();

    public void addOption(Option option) {
        options.add(option);
    }

    public void addAction(String access, Action action) {
        actions.put(access, action);
    }