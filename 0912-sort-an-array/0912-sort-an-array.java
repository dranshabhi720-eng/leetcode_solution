class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(a,l, m);

        mergeSort(a,m + 1, r);

        int[] t = new int[r -l + 1];
        int i = l, j = m + 1, k= 0;

        while (i <= m && j <= r)
            t[k++] = (a[i] < a[j]) ? a[i++] : a[j++];

        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];

        for (i = 0; i < t.length; i++)
            a[l + i] = t[i];
    }
}