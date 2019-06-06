package ua.lviv.iot.lab8.repository;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.lab8.models.Tools;

public interface ToolsRepository<T extends Tools> extends CrudRepository<T, Integer> {

}
