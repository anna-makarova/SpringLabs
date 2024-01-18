package ru.makarova.MySecondAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.makarova.MySecondAppSpringBoot.model.Request;


@Service
public class ModifySourceRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSource("Service 1");
    }
}

