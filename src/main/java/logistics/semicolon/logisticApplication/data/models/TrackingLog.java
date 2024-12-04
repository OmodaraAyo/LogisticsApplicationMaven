package logistics.semicolon.logisticApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("TrackingLog")
public class TrackingLog {

    @Id
    private String id;
//    private String description;
    private String trackingNumber;
    private String trackingDate;
}
