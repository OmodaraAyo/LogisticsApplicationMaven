package logistics.semicolon.logisticApplication.dtos.senderdtos;

import lombok.Data;

@Data
public class CreateSenderRequest {
    private String id;
    private String name;
    private String phoneNumber;
}
