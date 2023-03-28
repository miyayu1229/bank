
public class Sample9 {

	public static void main(String[] args) {
		Account3 acc = new Account3();
		acc.name = "銀行太郎";
		acc.no = 100;

		System.out.println("-----最初の状態-----");
		System.out.println("口座名義:" + acc.name + " 預金残高:" + acc.getBalance());

		System.out.println("-----直接残高を修正-----");
		acc.deposit(-1000L);
		System.out.println("口座名義:" + acc.name + " 預金残高:" + acc.getBalance());

	}

}

class Account3 {
	String name; 	// 口座名義
	int no;			// 口座番号
	private long balance;	// 預金残高

	/* 指定した金額を預金する */
	public void deposit(long amount){
		balance += amount;
	}

	/* 指定した金額を口座から引き出す */
	public void withdraw(long amount){
		balance -= amount;
	}

	/* 現在の預金残高を返す */
	public long getBalance() {
		return balance;
	}

}
