/** Copyright 2011 Fabian Steeg, University of Cologne, http://github.com/spinfo */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Collation.class, CollectionsGenerics.class, Crawling.class,
		EditDistance.class, HashTables.class, Index.class, Lists.class,
		Quicksort.class, SortSearch.class, Trees.class })
public class TestSuite {

}
