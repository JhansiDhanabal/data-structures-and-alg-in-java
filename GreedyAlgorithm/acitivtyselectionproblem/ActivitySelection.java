package greedyalgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
	public void activityselection(ArrayList<activity>activitylist) {
		Comparator<activity>activitycomparator = new Comparator<>() {

			@Override
			public int compare(activity o1, activity o2) {
				// TODO Auto-generated method stub
				return o1.end-o2.end;
			}
			
		};
		Collections.sort(activitylist, activitycomparator);
		activity current = activitylist.get(0);
		System.out.print(current.name+" ");
		for(int i=1;i<activitylist.size();i++) {
			activity act1 = activitylist.get(i);
			if(act1.start>=current.end) {
				current = act1;
				System.out.print(current.name+" ");
			}
		}
	}

}
