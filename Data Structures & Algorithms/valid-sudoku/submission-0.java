class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> column = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(board[r][c] == '.'){
                    continue;
                }
                String sq = (r / 3) + "," + (c / 3);
                if(row.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                column.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
            square.computeIfAbsent(sq, k -> new HashSet<>()).contains(board[r][c])){
                    return false;
                }

                row.get(r).add(board[r][c]);
                column.get(c).add(board[r][c]);
                square.get(sq).add(board[r][c]);
            }
        } 

        return true;
        
    }
}
