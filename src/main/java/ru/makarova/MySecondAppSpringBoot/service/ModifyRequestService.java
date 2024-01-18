package ru.makarova.MySecondAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.makarova.MySecondAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);

}

