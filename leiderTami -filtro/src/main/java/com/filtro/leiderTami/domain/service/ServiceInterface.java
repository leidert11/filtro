package com.filtro.leiderTami.domain.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface<T> {
    List<T> getAll();

}
