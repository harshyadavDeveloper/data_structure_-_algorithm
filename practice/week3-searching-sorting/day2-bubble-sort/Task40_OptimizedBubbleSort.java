// Task 40 (the optimization, and the important one): Real-world bubble sort includes an important early-exit improvement.
// Given {1, 2, 3, 5, 4, 6} — notice this array is almost fully sorted already, except one pair is swapped. A full, unoptimized
// bubble sort would still run all n-1 passes regardless, even though the array becomes fully sorted after just one swap. Add
// a boolean swapped flag: set it to false at the start of each pass, set it to true whenever an actual swap happens inside
// that pass, and break out of the outer loop entirely if a full pass completes with no swaps at all (since that means the array
// is already sorted — no further passes can possibly help). Test this on the near-sorted array above and confirm it exits early 
// rather than grinding through all remaining passes needlessly.

class Main{
    public static void main(String[] args){

    }
}