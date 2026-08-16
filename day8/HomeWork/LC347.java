class Pair {
    int first;  
    int second;  

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a.first!=b.first) return a.first - b.first;
                return a.second - b.second;
            }
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int freq = entry.getValue();

            Pair curr = new Pair(freq, element);

            if (pq.size() < k) {
                pq.offer(curr);
                continue;
            }

            if (curr.first < pq.peek().first) {
                continue;
            }

            pq.poll();
            pq.offer(curr);
        }


        int[] ans = new int[k];
        int idx = 0;

        while (!pq.isEmpty()) {
            ans[idx++] = pq.poll().second;
        }

        return ans;
    }
}