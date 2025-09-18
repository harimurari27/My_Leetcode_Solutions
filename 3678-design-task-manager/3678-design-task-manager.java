class TaskManager {
    private Map<Integer, int[]> taskMap;
    private PriorityQueue<int[]> maxHeap;

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        maxHeap = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0]; 
            return b[1] - a[1];
        });

        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), priority = t.get(2);
            taskMap.put(taskId, new int[]{userId, priority});
            maxHeap.offer(new int[]{priority, taskId, userId});
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        taskMap.put(taskId, new int[]{userId, priority});
        maxHeap.offer(new int[]{priority, taskId, userId});
    }
    
    public void edit(int taskId, int newPriority) {
        int[] info = taskMap.get(taskId);
        if (info == null) return;
        int userId = info[0];
        taskMap.put(taskId, new int[]{userId, newPriority});
        maxHeap.offer(new int[]{newPriority, taskId, userId}); 
    }
    
    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }
    
    public int execTop() {
         while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int priority = top[0], taskId = top[1], userId = top[2];
            int[] current = taskMap.get(taskId);
            if (current != null && current[0] == userId && current[1] == priority) {
                taskMap.remove(taskId);
                return userId;
            }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */