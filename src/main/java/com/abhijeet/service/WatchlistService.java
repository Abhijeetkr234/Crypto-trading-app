package com.abhijeet.service;

import com.abhijeet.model.Coin;
import com.abhijeet.model.User;
import com.abhijeet.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;
    Watchlist createWatchlist(User user);
    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin, User user) throws Exception;
}
