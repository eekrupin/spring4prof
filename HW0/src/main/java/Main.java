package HW0.src.main.java;

public class Main {

    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
