class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hh = (hour % 12) * 30;
       double angle = Math.abs(hh + (minutes * 1.00)/2 - (minutes * 6.00));

        return Math.min(angle, Math.abs(360-angle));      
    }
}