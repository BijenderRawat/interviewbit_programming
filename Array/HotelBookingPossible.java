/*
 * Medium level q asked in Amazon and Microsoft
 * 
 * A hotel manager has to process N advance bookings of rooms for the next season. 
 * His hotel has C rooms. 
 * Bookings contain an arrival date and a departure date. 
 * He wants to find out whether there are enough rooms in the hotel to satisfy the demand. 
 * Write a program that solves this problem in time O(N log N) .
 */

import java.util.ArrayList;
import java.util.Collections;

class HotelBookingPossible {

    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
        if (arrive == null || depart == null)
            return false;
        Collections.sort(arrive);
        Collections.sort(depart);
        for (int i = 0; i < arrive.size(); i++) {
            if (arrive.get(i) > depart.get(0))
                depart.remove(0);
        }
        return depart.size() <= k ? true : false;
    }
}