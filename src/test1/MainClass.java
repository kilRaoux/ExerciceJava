package test1;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainClass {

	private static String addMathDot(String equation) {
		equation = equation.replace("cos", "Math.cos");
		equation = equation.replace("sin", "Math.sin");
		equation = equation.replace("tan", "Math.tan");
		equation = equation.replace("sqrt","Math.sqrt");
		equation = equation.replace("exp", "Math.exp");
		return equation.replace("pow", "Math.pow");
	}

	public static void calculatrice(String equation) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
		try {
			System.out.println(engine.eval(addMathDot(equation)));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Fizz ou Buzz? Utilisons un for pour verifier cette question exceistancielle.
	 * @param maxSize: taille du dernier element afficher -1.
	 */
	public static void fizzBuzzFor(int maxSize) {
		for (int i = 0; i<maxSize; i++) {
			if (i%7 == 0) {
				System.out.println("Buzz");
			}
			else if( i%5 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	/**
	 * Fizz ou Buzz? Utilisons un while pour verifier cette question exceistancielle.
	 * @param maxSize: taille du dernier element afficher -1.
	 */
	public static void fizzBuzzWhile(int maxSize) {
		int i = 0;
		while (i < maxSize) {
			if (i%7 == 0) {
				System.out.println("Buzz");
			}
			else if( i%5 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}
	public static void resolve(String equation, float xValue) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
		try {
			engine.put("x", xValue);
			System.out.println(engine.eval(addMathDot(equation)));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int test1() {
		return 2;
	}
}
