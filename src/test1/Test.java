package test1;

public class Test {

	private String name;
	protected Test(String name, int n) {
		int nb[] = {0,1,2,3,5};
		this.test(nb);
		for (int i : nb) {
			System.out.println(i);
		}
		System.out.println(nb);
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void test(int[] tab) {
		tab[0] = 1;

	}

	@Override
	public String toString() {
		return "salut les amis je suis un test!";
	}
}
