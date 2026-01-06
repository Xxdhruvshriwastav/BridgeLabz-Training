package com.dsa.linkedlist.singlylinkedlist.socialmediaconnections;

public class UserNode {
	int userId;
    String name;
    int age;
    FriendNode friends;   
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}
