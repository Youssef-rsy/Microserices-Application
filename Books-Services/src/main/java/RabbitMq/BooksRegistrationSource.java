package RabbitMq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BooksRegistrationSource {

	@Output("booksChannel")
	MessageChannel booksRegistrationChannele();
}
