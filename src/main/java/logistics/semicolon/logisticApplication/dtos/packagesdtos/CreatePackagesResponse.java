package logistics.semicolon.logisticApplication.dtos.packagesdtos;

import logistics.semicolon.logisticApplication.data.models.Receiver;
import logistics.semicolon.logisticApplication.data.models.Sender;
import logistics.semicolon.logisticApplication.data.models.TrackingLog;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CreatePackagesResponse {
    private String packageId;
    private String packageDescription;
    private String createdAt;
    private Sender sender;
    private Receiver receiver;
    private List<TrackingLog> trackingLogList;
    private long deliveryFee;
    private int quantity;
}
