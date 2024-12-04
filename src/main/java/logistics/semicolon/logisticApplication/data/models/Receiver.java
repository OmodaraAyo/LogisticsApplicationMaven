package logistics.semicolon.logisticApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Receiver")
public class Receiver {

    @Id
    private String id;
    private String fullName;
    private String phone;
    private String address;
}
