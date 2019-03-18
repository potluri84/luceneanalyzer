package sdanalyzer;

import org.apache.lucene.analysis.Analyzer;

import com.complexible.stardog.search.AnalyzerFactory;

public class analyzer implements AnalyzerFactory {

	public Analyzer get() {
		return new customanalyzer();
	}

}
