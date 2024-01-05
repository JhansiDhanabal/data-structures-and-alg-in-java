package greedyalgorithm;

import java.util.ArrayList;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"A1","A2","A3","A4","A5","A6"};
		int start[] = {0, 3, 1, 5, 5, 8};
		int end[] = {6, 4, 2, 8, 7, 9};
		ArrayList<activity>activitylist = new ArrayList<>();
		for(int i=0;i<start.length;i++) {
			activitylist.add(new activity(name[i], start[i], end[i]));
		}
		ActivitySelection as = new ActivitySelection();
		as.activityselection(activitylist);
	}

}
