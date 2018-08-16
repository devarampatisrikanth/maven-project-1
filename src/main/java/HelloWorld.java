import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
<<<<<<< HEAD
		get("/hello", (req, res) -> "Hello World devops is good one");
=======
		get("/hello", (req, res) -> "Hello World devops is good ");
>>>>>>> 1a8e5d01b732ebe180e911457b660fa0202ac0de
	}
}
