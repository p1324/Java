package com.earlybird.array;

public class LadderProblem {
	

	    public static int usageCount(int[] ladder) {
	        int maxUsageCount = Integer.MAX_VALUE; // Start with a large number
System.out.println(maxUsageCount);
	        for (int i = 0; i < ladder.length; i++) {
	            ladder[i]--; // Simulate using the ladder step
System.out.println(ladder[i]);
	            // Update maxUsageCount to the minimum of its current value and the current ladder step integrity
	            maxUsageCount = Math.min(maxUsageCount, ladder[i]);
System.out.println("maxUsage"+maxUsageCount);
	            // If at any point maxUsageCount drops to 0, the ladder can no longer be used
	            if (maxUsageCount == 0) {
	                break;
	            }
	        }

	        return maxUsageCount;
	    }

	    public static void main(String[] args) {
	        int[] ladder = { 7, 7, 8, 9, 6, 11, 9 };
	        System.out.println(usageCount(ladder)); // Should print 5
	    }
	}


