package ru.tolmachev.pastebox.API.Request;

import lombok.Data;

@Data
public class PasteBoxRequest {
    private String data;
    private long expirationTimeSeconds;
    private PublicStatus publicStatus;
}
