package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CriminalStatus{

    ATLARGE("At large"),
    CAPTURED("Captured"),
    DECEASED("Deceased"),
    OUTLAW("Outlaw");

    private final String description;
}
