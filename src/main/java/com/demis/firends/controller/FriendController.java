package com.demis.firends.controller;

import com.demis.firends.model.Friend;
import com.demis.firends.service.FriendService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController {
   private FriendService friendService;

    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/test")
    public String test(){
        return  "test my name is hamed";
    }

    @GetMapping("/friends")
    public List<Friend> getFriends(){
        return  friendService.getFriends();
    }

    @PostMapping("/friends/add")
    public Friend addFriend(@RequestBody Friend friend){
        return  friendService.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public Friend updateFriend(@PathVariable("id") Integer id,@RequestBody Friend friend){
        return  friendService.updateFriend(friend);
    }

    @DeleteMapping("/friends/{id}/delete")
    public Boolean updateFriend(@PathVariable("id") Integer id){
        return  friendService.deleteFriend(id);
    }
}
