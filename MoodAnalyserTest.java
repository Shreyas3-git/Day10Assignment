import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void MoodAnalysertest() 
	{
		Base junit = new Base();
		String str ;
		
		str = junit.AnalyseMood();
		Assert.assertEquals("SAD", str);
	}

}
