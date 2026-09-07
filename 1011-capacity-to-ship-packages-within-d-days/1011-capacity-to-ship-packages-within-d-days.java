class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(left, w); // Minimum capacity
            right += w;               // Maximum capacity
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int day = 1, load = 0;

        for (int w : weights) {
            if (load + w > capacity) {
                day++;
                load = 0;
            }
            load += w;
        }

        return day <= days;
    }
}
 