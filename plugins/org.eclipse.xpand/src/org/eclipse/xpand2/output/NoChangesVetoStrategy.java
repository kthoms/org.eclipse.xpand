package org.eclipse.xpand2.output;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NoChangesVetoStrategy implements VetoStrategy {
	
	private final Log log = LogFactory.getLog(getClass());

	public boolean hasVeto(FileHandle handle) {
		return !hasChanges(handle);
	}

	public boolean hasChanges(FileHandle h) {
		if (h.getTargetFile().exists()) {
			try {
				InputStream oldIs = new FileInputStream(h.getTargetFile());
				byte[] bytes = getBytes(h);
				try {
					byte[] lbuffer = new byte[bytes.length];
					oldIs.read(lbuffer);
					if (oldIs.read() ==-1) {
						for (int i = 0; i < lbuffer.length; i++) {
							if (lbuffer[i]!=bytes[i])
								return true;
						}
					} else {
						return true;
					}
					return false;
				} finally {
					oldIs.close();
				}
			} catch (Exception e) {
				log.error("Couldn't compare content of file "+h.getTargetFile().getAbsolutePath(), e);
				log.error("File "+h.getTargetFile().getAbsolutePath()+" will not be overwritten");
				return false;
			}
		}
		return true;
	}
	
	public byte[] getBytes(FileHandle h) {
		if (h.getFileEncoding() != null) {
			try {
				return h.getBuffer().toString().getBytes(h.getFileEncoding());
			} catch (UnsupportedEncodingException e) {
				log.error(e.getMessage(), e);
			}
		}
		return h.getBuffer().toString().getBytes();
	}
}
