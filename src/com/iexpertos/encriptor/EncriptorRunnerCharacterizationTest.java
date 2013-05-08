package com.iexpertos.encriptor;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import org.junit.Test;

public class EncriptorRunnerCharacterizationTest {

	public class Checker extends OutputStream {

		private Checksum checksum = new CRC32();

		@Override
		public void write(int b) throws IOException {
			checksum.update(b);
		}
		
		public long getChecksumValue(){
			return this.checksum.getValue();
		}
	}
	
	@Test
	public void shouldExecuteMainEncriptor() {
		Checker checker = new Checker();
		System.setOut(new PrintStream(checker));
		Main.main(null);
		assertNotNull(checker.getChecksumValue());
	}

}
