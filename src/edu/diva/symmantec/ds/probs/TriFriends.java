package edu.diva.symmantec.ds.probs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TriFriends {

	public static void main(String[] args) {
		int numberOfFriends = 5;
		int sequence1[] = new int[] {1,1,2,2,3,4};
		int sequence2[] = new int[] {2,3,3,4,4,5};
		
		Map<Integer, FriendNode> friendsMap = new HashMap<>();
		for(int i = 1; i <=numberOfFriends ;i++) {
			FriendNode f = new FriendNode(i);
			friendsMap.put(i, f);
		}
		
		for(int i = 0;i<sequence1.length;i++) {
			FriendNode f = friendsMap.get(sequence1[i]);
			Set<FriendNode> nodes = f.getFriendNodes();
			if(nodes == null) {
				nodes = new LinkedHashSet<FriendNode>();
			}
			nodes.add(friendsMap.get(sequence2[i]));
			f = friendsMap.get(sequence2[i]);
			Set<FriendNode> nodes2 = f.getFriendNodes();
			if(nodes2 == null) {
				nodes2 = new LinkedHashSet<FriendNode>();
			}
			nodes2.add(friendsMap.get(sequence1[i]));
		}
	}
	
	private int calculateMinFriendshipScore(Map<Integer, FriendNode> friendsMap) {
		int score = 0;
		Map<String, Integer> trioMap = new HashMap<>();
		for(int i : friendsMap.keySet()) {
			FriendNode f = friendsMap.get(i);
			
			//Find a Trio
			//Calculate Score
			//Return min score
			
		}
		return score;
	}
	
	private static Set<String> findTrios(FriendNode f, Set<FriendNode> remainingFriends) {
		for(FriendNode node : remainingFriends) {
			if(node.getFriendNodes().contains(f)) {
				
			}
		}
		return null;
	}

}

class FriendNode {
	private int friendId;
	private Set<FriendNode> friendNodes;
	
	public FriendNode(int i) {
		this.friendId = i;
	}
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public Set<FriendNode> getFriendNodes() {
		return friendNodes;
	}
	public void setFriendNodes(Set<FriendNode> friendNodes) {
		this.friendNodes = friendNodes;
	}
	
	
}