package logistics.semicolon.logisticApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Packagee {

    @Id
    private String packageId;
    private String packageDescription;
    private String createdAt;
    @DBRef
    private Sender sender;
    @DBRef
    private Receiver receiver;
    @DBRef
    private List<TrackingLog> trackingLogList;
    private long deliveryFee;
    private int quantity;

}
