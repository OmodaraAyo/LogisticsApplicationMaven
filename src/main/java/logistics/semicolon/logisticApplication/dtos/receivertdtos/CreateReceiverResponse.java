package logistics.semicolon.logisticApplication.dtos.receivertdtos;

import lombok.Data;

@Data
public class CreateReceiverResponse {
    private String id;
    private String fullName;
    private String phone;
    private String address;
}
