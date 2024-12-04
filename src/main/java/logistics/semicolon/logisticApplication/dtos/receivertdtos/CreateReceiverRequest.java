package logistics.semicolon.logisticApplication.dtos.receivertdtos;

import lombok.Data;

@Data
public class CreateReceiverRequest {
    private String id;
    private String fullName;
    private String phone;
    private String address;
}
