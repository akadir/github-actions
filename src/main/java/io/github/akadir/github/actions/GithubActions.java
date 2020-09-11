package io.github.akadir.github.actions;

import io.github.akadir.github.actions.foo.Calculate;

public class GithubActions {
    public static void main(String[] args) {
        System.out.println("Hello world. " + Calculate.add(2, 3));
    }
}
