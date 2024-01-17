package ru.makarova.MySecondAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.makarova.MySecondAppSpringBoot.model.Response;


@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
