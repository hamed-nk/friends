package com.demis.firends.service.impl;

import com.demis.firends.model.Friend;
import com.demis.firends.repository.FriendRepository;
import com.demis.firends.service.FriendService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    private final FriendRepository friendRepository;

    public FriendServiceImpl(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }


    @Override
    public List<Friend> getFriends() {
        return friendRepository.findAll();
    }

    @Override
    public Friend addFriend(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public Friend updateFriend(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public Boolean deleteFriend(Integer id) {
        friendRepository.deleteById(id);
        return true;
    }
}
