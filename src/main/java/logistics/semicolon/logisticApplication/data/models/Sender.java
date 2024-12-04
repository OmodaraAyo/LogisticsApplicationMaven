package logistics.semicolon.logisticApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Sender")
public class Sender {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
}
