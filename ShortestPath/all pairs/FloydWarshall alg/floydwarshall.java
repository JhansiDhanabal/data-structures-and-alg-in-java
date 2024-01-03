public void floyd_warshall() {
		int n = nodelist.size();
		int v[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) 
					v[i][j] = 0;
				else if(nodelist.get(i).neighbours.contains(nodelist.get(j))) 
					v[i][j] = nodelist.get(i).map.get(nodelist.get(j));
				else
					v[i][j] = Integer.MAX_VALUE/10;
			}
		}
		
		System.out.println("\n  ");
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(v[i][j]>v[i][k]+v[k][j])
						v[i][j] = v[i][k]+v[k][j];
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(" "+nodelist.get(i).value+" ");
		}
		for(int i=0; i<n; i++) {
			System.out.print("\n"+nodelist.get(i).value+" ");
			for(int j=0; j<n; j++) {
				System.out.print(" "+v[i][j]);
			}
		}
	}
