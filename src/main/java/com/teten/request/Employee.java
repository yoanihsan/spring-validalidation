package com.teten.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class Employee {
    @Max(20)
    @NotBlank
    private String name;
    @NotBlank
    private String nip;
    @Pattern(regexp = "^$|^62\\d{6,12}$")
    private String phoneNumber;
    @Pattern(regexp = "IT|HR|MARKETING")
    private String divisi;
}
