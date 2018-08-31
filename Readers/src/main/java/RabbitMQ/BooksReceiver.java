package RabbitMQ;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Configuration
@EnableBinding(Sink.class)
public class BooksReceiver {

	@StreamListener(target = Sink.INPUT)
	public void ProcessRegisterBooks(String books) {
		System.out.println("booksServices -> message from RabbitMQ :"+books);
	}
}
