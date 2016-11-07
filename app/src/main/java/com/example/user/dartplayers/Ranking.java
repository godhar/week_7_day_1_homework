package com.example.user.dartplayers;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    DartPlayer player;
    private ArrayList<DartPlayer> mRankings;

    public Ranking() {
        mRankings = new ArrayList<DartPlayer>();

    }

    public Ranking(ArrayList<DartPlayer> rankings) {
        mRankings = new ArrayList<DartPlayer>(rankings);
    }

    public ArrayList<DartPlayer> getRankings() {
        return new ArrayList<DartPlayer>(mRankings);
    }

    public int getListSize() {
        return mRankings.size();
    }

    public DartPlayer getPlayerAtIndex(int index) {
        DartPlayer player = mRankings.remove(index);
        return player;
    }

    public DartPlayer getLowestRankedPlayer() {
        DartPlayer player = getPlayerAtIndex(getListSize() - 1);
        return player;
    }

    public void replacePlayerAtEndOfList(DartPlayer player) {
        mRankings.remove(getListSize() - 1);
        mRankings.add(player);
    }

    public DartPlayer getPlayerAtRank(int rank) {
        return getPlayerAtIndex(rank - 1);
    }

    public DartPlayer getPlayerByName(String name) {
        for (DartPlayer player : mRankings) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }
}
