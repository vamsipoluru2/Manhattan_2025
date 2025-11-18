import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Yes, if you are using MaveN, you need to declare 
//JUnit as a dependency in pom.xml.
//
//If you are not using MaveN, you must manually 
//add JUnit JARs to your class path.

//01MyFirstTesting (Maven project)
//→ JUnit comes from Maven dependencies (managed automatically).
//
//MyFirstProject (Plain Java project)
//→ JUnit is added manually to the project build path.
class Sample {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
