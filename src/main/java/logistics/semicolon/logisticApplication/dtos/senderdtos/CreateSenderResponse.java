package logistics.semicolon.logisticApplication.dtos.senderdtos;

import lombok.Data;

@Data
public class CreateSenderResponse {
    private String id;
    private String name;
    private String phoneNumber;
}
