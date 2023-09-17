package com.gamesApp.gameOn.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gamesApp.gameOn.models.DashboardTable;

public interface DashboardRepo extends CrudRepository<DashboardTable, String>{

}
