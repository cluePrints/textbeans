/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * This file is part of Beaver Parser Generator.                       *
 * Copyright (C) 2003,2004 Alexander Demenchuk <alder@softanvil.com>.  *
 * All rights reserved.                                                *
 * See the file "LICENSE" for the terms and conditions for copying,    *
 * distribution and modification of Beaver.                            *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package beaver.comp.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *  
 */
public class SrcReader extends Reader
{
	BufferedReader reader;
	public File file;

	public SrcReader(File src_file) throws IOException
	{
		super();
		file = src_file;
		reader = new BufferedReader(new FileReader(src_file));
	}
	
	public SrcReader(Reader in)
	{
		reader = new BufferedReader(in);
	}

	public int read(char[] buf, int off, int len)
	{
		try {
			return reader.read(buf, off, len);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public void reset()
	{
		throw new RuntimeException("Oops");		
	}

	public void close()
	{
		try {
			reader.close();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}		
	}
}