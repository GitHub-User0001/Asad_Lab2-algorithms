package transactions;

public class Transactions {
		
		public int isTargetAchieved(int[] array, int target) {
			int status = -1;
			long sum = 0l;
			for(int i=0;i<array.length;i++) {
				sum+=array[i];
				if(sum>=target) {
					status=i+1;
					break;
				}
			}
			return status;
		}
}
