package edu.diva.symmantec.ds.probs;

public class RockysSprints {

	public static void main(String[] args) {
		
		System.out.println(getMostVisitedSprint(9, new int[]{9,7,3,1}));
	}
	
	private static int getMostVisitedSprint(int trailPosCount, int[] sprint) {
		int trailPositions[]= new int[trailPosCount];
		runThroughRocky(sprint, trailPositions);
		return findMostVisitedPos(trailPositions);
	}
	
	private static int findMostVisitedPos(int[] trailPositions) {
		int maxVisited = 0;
		for(int i = 1; i<trailPositions.length;i++) {
			if(trailPositions[maxVisited] < trailPositions[i]) {
				maxVisited = i;
			}
		}
		return maxVisited+1;
	}
	
	private static void runThroughRocky(int sprint[], int trailPositions[]) {
		int startPosition = sprint[0], endPosition = 0;
		for(int i = 1;i<sprint.length;i++) {
			endPosition = sprint[i];
			if(startPosition > endPosition) {
				int temp = endPosition;
				endPosition = startPosition;
				startPosition = temp;
				
			}
			for(int j=startPosition;j<=endPosition;j++) {
				trailPositions[j-1]++;
			}
			startPosition = sprint[i];
		}
	}
}
