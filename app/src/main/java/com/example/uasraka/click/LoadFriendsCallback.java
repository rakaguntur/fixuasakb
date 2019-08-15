package com.example.uasraka.click;

import com.example.uasraka.entity.Friends;

import java.util.ArrayList;

// 10/08/2019 - 10116329 - Raka Guntur Alviansyah - IF-8
public interface LoadFriendsCallback {
    void preExecute();
    void postExecute(ArrayList<Friends> friends);
}
