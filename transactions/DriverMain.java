package transactions;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		
		Transactions transactions = new Transactions();
		int transactionArr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		transactionArr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the transaction value" +(i+1));
			transactionArr[i] = sc.nextInt();
		}
		System.out.println("Enter the number of targets to be achieved");
		int target=sc.nextInt();
		
		for(int j=0;j<target;j++) {
			System.out.println("Enter the target values");
			int t1=sc.nextInt();
			int transactionNumber=transactions.isTargetAchieved(transactionArr, t1);
			if(transactionNumber==-1) {
				System.out.println("Target not achieved");
			}
			else {
				System.out.println("Target achieved at "+transactionNumber+" transaction");
			}
		}sc.close();
	}
}
