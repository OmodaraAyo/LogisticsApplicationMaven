package logistics.semicolon.logisticApplication.data.repositories;

import logistics.semicolon.logisticApplication.data.models.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Senders extends MongoRepository<Sender, String> {
}
