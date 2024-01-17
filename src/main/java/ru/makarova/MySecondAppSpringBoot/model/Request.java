package ru.makarova.MySecondAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @NotBlank(message = "Уникальный идентификатор операции - обязательный параметр")
    @Size(max = 32, message = "Уникальный идентификатор операции должен быть не более 32 символов")
    private String uid;
    @NotBlank
    @Size(max = 32)
    private String operationUid;
    @JsonDeserialize(using = SystemNameDeserializer.class)
    private Systems systemName;

    @NotBlank(message = "Время создания сообщения - обязательный параметр")
    private String systemTime;

    private String source;
    @Min(value = 1)
    @Max(value = 100000)
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid=' " + uid + '\'' +
                ", operationUid=' " + operationUid + '\'' +
                ", systemName=' " + systemName + '\'' +
                ", systemTime=' " + systemTime + '\'' +
                ", source=' " + source + '\'' +
                ", communicationId=' " + communicationId + '\'' +
                ", templateId=' " + templateId + '\'' +
                ", productCode=' " + productCode + '\'' +
                ", smsCode=' " + smsCode + '\'' +
                '}';
    }
}

