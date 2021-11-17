package com.demis.firends.service;

import com.demis.firends.model.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> getFriends();

    Friend addFriend(Friend friend);

    Friend updateFriend(Friend friend);

    Boolean deleteFriend(Integer id);

}
