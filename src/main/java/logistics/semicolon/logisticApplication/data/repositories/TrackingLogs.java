package logistics.semicolon.logisticApplication.data.repositories;

import logistics.semicolon.logisticApplication.data.models.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingLogs extends MongoRepository<TrackingLog, String> {
}
