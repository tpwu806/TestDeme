package test2016.datadtructures.part5.cuckooHashing;

public interface HashFamily<T> {
	
	int hash(T x,int which);
	int getNumberOfFunctions();
	void generateNewFunctions();
}
