
public class Sample9 {

	public static void main(String[] args) {
		Account3 acc = new Account3();
		acc.name = "��s���Y";
		acc.no = 100;

		System.out.println("-----�ŏ��̏��-----");
		System.out.println("�������`:" + acc.name + " �a���c��:" + acc.getBalance());

		System.out.println("-----���ڎc�����C��-----");
		acc.deposit(-1000L);
		System.out.println("�������`:" + acc.name + " �a���c��:" + acc.getBalance());

	}

}

class Account3 {
	String name; 	// �������`
	int no;			// �����ԍ�
	private long balance;	// �a���c��

	/* �w�肵�����z��a������ */
	public void deposit(long amount){
		balance += amount;
	}

	/* �w�肵�����z��������������o�� */
	public void withdraw(long amount){
		balance -= amount;
	}

	/* ���݂̗a���c����Ԃ� */
	public long getBalance() {
		return balance;
	}

}
