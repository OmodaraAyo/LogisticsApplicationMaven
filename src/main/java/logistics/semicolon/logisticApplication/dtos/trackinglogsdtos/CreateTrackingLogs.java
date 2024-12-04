package logistics.semicolon.logisticApplication.dtos.trackinglogsdtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateTrackingLogs {
    private String id;
    private String description;
    private String trackingNumber;
    private LocalDateTime trackingDate;
}
