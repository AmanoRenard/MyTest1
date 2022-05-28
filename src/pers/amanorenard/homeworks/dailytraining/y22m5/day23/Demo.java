package pers.amanorenard.homeworks.dailytraining.y22m5.day23;

import java.util.*;

class Demo {
    public static void main(String[] args) {
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        ArrayList<String> pokers = new ArrayList<>();
        for (String i : nums) {
            for (String j : colors) {
                pokers.add(j + i);
            }
        }
        pokers.add("小王");
        pokers.add("大王");

        HashMap<Short, String> pokerMap = new HashMap<>();
        for (short i = 0; i < pokers.size(); i++) {
            pokerMap.put(i, pokers.get(i));
        }

        ArrayList<Short> indArr = new ArrayList<>(pokerMap.keySet());
        Collections.shuffle(indArr);

        ArrayList<TreeSet<Short>> playerPokerInd = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            playerPokerInd.add(new TreeSet<>(
                    new Comparator<Short>() {
                        @Override
                        public int compare(Short aShort, Short t1) {
                            return t1 - aShort;
                        }
                    }
            ));
        }
        for (int i = 0; i < pokers.size(); i++) {
            if (i >= pokers.size() - 3) {
                playerPokerInd.get(3).add(indArr.get(i));
            } else {
                playerPokerInd.get(i % 3).add(indArr.get(i));
            }
        }

        for (TreeSet<Short> shorts : playerPokerInd) {
            lookPoker(pokers, shorts);
        }
    }

        public static void lookPoker(ArrayList<String> poker, TreeSet<Short> arr) {
            for (short i : arr) {
                System.out.printf("%s ", poker.get(i));
            }
            System.out.println();
        }
    }