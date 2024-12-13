class Solution {
    public int hammingDistance(int x, int y) {
        int differentBits = x ^ y;
        return Integer.bitCount(differentBits);
    }
}