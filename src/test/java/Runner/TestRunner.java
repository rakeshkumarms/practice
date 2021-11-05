package Runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junitmain.FirstClass;

@RunWith(Suite.class)
@SuiteClasses({FirstClass.class})
public class TestRunner {

}
