import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@Builder
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "of")
public class Car {
    @NonNull
    String serialNumber;
    String color;
    @NonNull
    CarConstructor constructor;
    @NonNull
    double price;
    int power;
}
