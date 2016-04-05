
package no.imr.nmdapi.exceptions;

import java.io.File;

/**
 *
 * @author kjetilf
 */
public class CantWriteFileException extends S2DException {

    private File file;

    /**
     *
     * @param message
     * @param file
     */
    public CantWriteFileException(String message, File file) {
        super(message);
        this.file = file;
    }

    /**
     *
     * @param message
     * @param file
     * @param cause
     */
    public CantWriteFileException(String message, File file, Exception cause) {
        super(message, cause);
        this.file = file;
    }

    /**
     * Get file descriptor.
     * 
     * @return
     */
    public File getFile() {
        return file;
    }

}
