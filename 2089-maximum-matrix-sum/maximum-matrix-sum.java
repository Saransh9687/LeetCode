class Solution {
    public long maxMatrixSum(int[][] matrix) {

  
        List<Integer> arr = new ArrayList<>();

        // 1️⃣ Flatten the matrix
        for (int[] row : matrix) {
            for (int val : row) {
                arr.add(val);
            }
        }

        // 2️⃣ Sort
        Collections.sort(arr);

        int n = arr.size();

        // 3️⃣ Flip in pairs if beneficial
        for (int i = 0; i < n - 1; i += 2) {
            int a = arr.get(i);
            int b = arr.get(i + 1);

            if (a + b < 0) {        // flipping increases sum
                arr.set(i, -a);
                arr.set(i + 1, -b);
            }
        }

        // 4️⃣ Sum all elements
        long sum = 0;
        for (int x : arr) {
            sum += x;
        }

        return sum;
    
    }
}

        