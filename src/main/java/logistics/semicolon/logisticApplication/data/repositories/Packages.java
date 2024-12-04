package logistics.semicolon.logisticApplication.data.repositories;

import logistics.semicolon.logisticApplication.data.models.Packagee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Packages extends MongoRepository<Packagee, String> {
}
