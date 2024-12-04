package logistics.semicolon.logisticApplication.data.repositories;

import logistics.semicolon.logisticApplication.data.models.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Receivers extends MongoRepository<Receiver, String> {
}
