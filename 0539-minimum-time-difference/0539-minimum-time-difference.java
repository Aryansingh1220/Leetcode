class Solution {
    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int min=Integer.MAX_VALUE;
        int firsttime=timeToMinutes(timePoints.get(0));
        int lasttime=firsttime;
        for(int i=1;i<timePoints.size();i++){
            int currenttime=timeToMinutes(timePoints.get(i));
            min=Math.min(min,currenttime-lasttime);
            lasttime=currenttime;
        }
        int circular=1440-timeToMinutes(timePoints.get(timePoints.size()-1))+firsttime;
        min=Math.min(min,circular);
        return min;
    }
}