package to_work;
import com.twilio.Twilio;
import com.twilio.rest.api.v1.Message;
import com.twilio.type.PhoneNumber;

public class WhatsAppBot {
    public static final String ACCOUNT_SID = "AC8796cfffd9c42f3f2e4acedd94cd3e5a";
    public static final String AUTH_TOKEN = "5ae95eb3f6b3c2fbf4d734a876b5dcce";
    public static final String FROM_NUMBER = "whatsapp:+5573981796883";
    public static final String TO_NUMBER = "whatsapp:+5573981796883";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message1 = Message.creator(
                new PhoneNumber(TO_NUMBER),
                new PhoneNumber(FROM_NUMBER),
                "Olá! Obrigado por entrar em contato conosco! Em que podemos ajudar?")
            .create();

        System.out.println(message1.getSid());

        Message message2 = Message.creator(
                new PhoneNumber(TO_NUMBER),
                new PhoneNumber(FROM_NUMBER),
                "Nós recebemos a sua mensagem e um de nossos atendentes entrará em contato com você em breve!")
            .create();

        System.out.println(message2.getSid());
    }
}