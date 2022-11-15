package BackTracking;

public class ������ {
	 public void solveSudoku(char[][] board) {
	        solveSudokuHelper(board);
	    }

	    private boolean solveSudokuHelper(char[][] board){
	        //��һ��forѭ���������̵��У�һ��forѭ���������̵��У�
	        // һ��һ��ȷ������֮�󣬵ݹ�������λ�÷�9�����ֵĿ����ԣ���
	        for (int i = 0; i < 9; i++){ // ������
	            for (int j = 0; j < 9; j++){ // ������
	                if (board[i][j] != '.'){ // ����ԭʼ����
	                    continue;
	                }
	                for (char k = '1'; k <= '9'; k++){ // (i, j) ���λ�÷�k�Ƿ����
	                    if (isValidSudoku(i, j, k, board)){
	                        board[i][j] = k;
	                        if (solveSudokuHelper(board)){ // ����ҵ�����һ�����̷���
	                            return true;
	                        }
	                        board[i][j] = '.';
	                    }
	                }
	                // 9�����������ˣ������У���ô�ͷ���false
	                return false;
	                // ��Ϊ���һ��һ��ȷ�������ˣ����ﳢ����9���������У�˵����������Ҳ��������������Ľ⣡
	                // ��ô��ֱ�ӷ��أ� ����Ҳ����Ϊʲôû����ֹ����Ҳ������Զ������̶����޵ݹ���ȥ����
	            }
	        }
	        // ������û�з���false��˵���ҵ��˺�������λ����
	        return true;
	    }

	    /**
	     * �ж������Ƿ�Ϸ�����������ά��:
	     *     ͬ���Ƿ��ظ�
	     *     ͬ���Ƿ��ظ�
	     *     9�������Ƿ��ظ�
	     */
	    private boolean isValidSudoku(int row, int col, char val, char[][] board){
	        // ͬ���Ƿ��ظ�
	        for (int i = 0; i < 9; i++){
	            if (board[row][i] == val){
	                return false;
	            }
	        }
	        // ͬ���Ƿ��ظ�
	        for (int j = 0; j < 9; j++){
	            if (board[j][col] == val){
	                return false;
	            }
	        }
	        // 9�������Ƿ��ظ�
	        int startRow = (row / 3) * 3;
	        int startCol = (col / 3) * 3;
	        for (int i = startRow; i < startRow + 3; i++){
	            for (int j = startCol; j < startCol + 3; j++){
	                if (board[i][j] == val){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}