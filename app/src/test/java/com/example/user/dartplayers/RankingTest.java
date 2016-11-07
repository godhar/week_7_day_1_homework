package com.example.user.dartplayers;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    protected ArrayList<DartPlayer> testRankings;
    DartPlayer player1;
    DartPlayer player2;
    DartPlayer player3;

    @Before
    public void before(){
        testRankings = new ArrayList<DartPlayer>();
        player1 = new DartPlayer("Johnny", "JPK", 1);
        player2 = new DartPlayer("Henry Jonnes", "HennyBaby", 2);
        player3 = new DartPlayer("Jimmy Favelo","Favo", 3);
        testRankings.add(player1);
        testRankings.add(player2);

    }


    @Test
    public void testCanMakeRankings(){
        Ranking ranking = new Ranking();
        assertNotNull(ranking.getRankings());
    }

    @Test
    public void testRankingsHaveLength(){
        Ranking ranking = new Ranking(testRankings);
        assertEquals(2, ranking.getListSize());
    }

    @Test
    public void testCanGetRankWithIndex(){
        Ranking ranking = new Ranking(testRankings);
        DartPlayer player = ranking.getPlayerAtIndex(0);
        assertEquals(1, player.getRank());
    }

    @Test
    public void testCanReplaceLastPlayerInList(){
        Ranking ranking = new Ranking(testRankings);
        ranking.replacePlayerAtEndOfList(player3);
        DartPlayer loser = ranking.getLowestRankedPlayer();
        assertEquals("Favo", loser.getNickName());

    }




}
