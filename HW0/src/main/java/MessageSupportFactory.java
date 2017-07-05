package HW0.src.main.java;

import java.io.FileInputStream;
import java.rmi.server.ExportException;
import java.util.Properties;

/**
 * Created by eekrupin on 04.07.2017.
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    public MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(new FileInputStream("HW0/msf.properties"));

            String renderClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer)Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }

    public MessageProvider getProvider() {
        return provider;
    }
}
