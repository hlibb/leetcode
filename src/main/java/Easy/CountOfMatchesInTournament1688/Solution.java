package Easy.CountOfMatchesInTournament1688;

public class Solution {
    public int numberOfMatches(int n) {
        int matchesPlayed = 0;
        while (n >= 2) {
            switch (n % 2) {
                case (0) -> {
                    matchesPlayed += n / 2;
                    n /= 2;
                }
                case (1) -> {
                    matchesPlayed += (n - 1) / 2;
                    n = (n - 1) / 2 + 1;
                }
            }
        }
        return matchesPlayed;
    }
}

//https://leetcode.com/problems/count-of-matches-in-tournament/
