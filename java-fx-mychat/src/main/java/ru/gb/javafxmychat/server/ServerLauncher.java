package ru.gb.javafxmychat.server;

public record ServerLauncher() {
    public static void main(String[] args) {
        new ChatServer().run();

    }
}