package logistics.semicolon.logisticApplication.dtos.trackinglogsdtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateTrackingLogsResponse {
    private String id;
    private String description;
    private String trackingNumber;
    private LocalDateTime trackingDate;
}
