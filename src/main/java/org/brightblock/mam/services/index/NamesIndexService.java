package org.brightblock.mam.services.index;

import java.util.List;

public interface NamesIndexService
{
	public int getNumbDocs();
	public void buildIndex(int from, int to);
	public void buildIndex(List<String> names);
}
