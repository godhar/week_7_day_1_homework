package com.example.user.dartplayers;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.*;
/**
 * Created by user on 07/11/2016.
 */

public class DartPlayerTest {

    DartPlayer dartPlayer;

    @Before
    public void before(){
        dartPlayer = new DartPlayer("Daniel Northbrook", "Northy", 1);
    }

    @Test
    public void testPlayerHasName(){
        assertEquals("Daniel Northbrook", dartPlayer.getName());
    }

    @Test
    public void testPlayerHasNickName(){
        assertEquals("Northy", dartPlayer.getNickName());
    }

    @Test
    public void testPlayerHasRank(){
        assertEquals(1, dartPlayer.getRank());
    }

    @Test
    public void testPlayersNameCanBeSet(){
        dartPlayer.setName("Jack");
        assertEquals("Jack", dartPlayer.getName());
    }

    @Test
    public void testPlayersRankCanBeSet(){
        dartPlayer.setRank(3);
        assertEquals(3, dartPlayer.getRank());
    }

    @Test
    public void testPlayersNickNameCanBeSet(){
        dartPlayer.setNickName("Southy");
        assertEquals("Southy", dartPlayer.getNickName());
    }

    @Test
    public void testPlayerGetsDisplayed(){
        assertEquals("Name: Daniel Northbrook, NickName: Northy, Rank: 1", dartPlayer.toString());
    }
}
