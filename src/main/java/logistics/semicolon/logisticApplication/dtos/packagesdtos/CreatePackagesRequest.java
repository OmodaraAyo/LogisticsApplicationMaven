package logistics.semicolon.logisticApplication.dtos.packagesdtos;

import logistics.semicolon.logisticApplication.data.models.Receiver;
import logistics.semicolon.logisticApplication.data.models.Sender;
import logistics.semicolon.logisticApplication.data.models.TrackingLog;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Data
public class CreatePackagesRequest {
    private String packageId;
    private String packageDescription;
    private String createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    private String sendersName;
    private String sendersPhoneNumber;
    private Sender sender;
    private String receiversName;
    private String receiversPhoneNumber;
    private String receiverAddress;
    private Receiver receiver;
    private TrackingLog trackingLogList;
    private String trackingDate;
    private String trackingNumber;
    private long deliveryFee;
    private int quantity;

}
