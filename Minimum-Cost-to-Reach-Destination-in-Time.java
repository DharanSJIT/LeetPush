1class Solution {
2
3    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
4
5        int n = passingFees.length;
6        List<ArrayList<int[]>> graph = new ArrayList(n);
7
8        //minimum time needed to reach a vertex as there can be multiple roads 
9        //connecting the same cities
10        int[] minTime = new int[n];
11        
12        Arrays.fill(minTime, Integer.MAX_VALUE);
13
14        for(int i=0; i<n; i++) {
15            graph.add(new ArrayList<>());
16        }
17
18        for(int[] edge : edges) {
19            int u = edge[0], v = edge[1], t = edge[2];
20            graph.get(u).add(new int[]{v, t});
21            graph.get(v).add(new int[]{u, t});
22        }
23
24        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
25        pq.add(new int[]{0, passingFees[0], 0});
26
27        while(!pq.isEmpty()) {
28            
29            int[] curr = pq.poll();
30            int u = curr[0], cost = curr[1], time = curr[2];
31
32            //Avoid the longer road/route and break if time exceeds limit
33            if(time >= minTime[u] || time > maxTime) continue;
34
35            //found the solution
36            if(u == n-1) return cost;
37
38            //if a shorter alternative found
39            minTime[u] = time;
40
41            for(int[] adj : graph.get(u)) {
42                int v = adj[0], t = adj[1];
43                pq.offer(new int[]{v, cost + passingFees[v], time + t});
44            }
45        }
46
47        return -1;
48    }
49
50
51}