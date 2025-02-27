package com.abhijeet.repository;

import com.abhijeet.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {

}
