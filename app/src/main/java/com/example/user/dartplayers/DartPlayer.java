package com.example.user.dartplayers;
import java.lang.*;

/**
 * Created by user on 07/11/2016.
 */

public class DartPlayer {

    String name;
    String nickName;
    int currentRank;

    public DartPlayer(String name, String nickName, int currentRank ){
        this.name = name;
        this.nickName = nickName;
        this.currentRank = currentRank;
    }

    public String getName(){
        return this.name;
    }

    public String getNickName(){
        return this.nickName;
    }

    public int getRank(){
        return this.currentRank;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setNickName(String newNickName){
        this.nickName = newNickName;
    }

    public void setRank(int newRank){
        this.currentRank = newRank;
    }

    public String toString(){
        String result = String.format("Name: %s, NickName: %s, Rank: %d ", this.name, this.nickName, this.currentRank);
        return result;
    }
}

