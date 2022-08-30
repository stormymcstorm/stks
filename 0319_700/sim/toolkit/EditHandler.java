//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * This class is the basic class for the construction of a list of simple TLV elements.
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF
 *
 * @see ViewHandler
 * @see ProactiveHandler
 * @see EnvelopeResponseHandler
 * @see ToolkitException
 */
public class EditHandler extends ViewHandler {

    // ------------------------------- Constructors ---------------------------
    /**
     * Builds a new EditHandler object.
     *
     * @param buffer the buffer containg the TLV list
     * @param offset the position of the TLV list
     * @param length the length of the TLV list
	 *
     * @exception NullPointerException if <code>buffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     */
    public EditHandler(byte[] buffer, short offset, short length) 
    												throws 	NullPointerException,
                                                    		ArrayIndexOutOfBoundsException  {
    }


    // ------------------------------- Public methods -------------------------
    /**
     * Clears an EditHandler buffer.
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void clear() throws ToolkitException {
    }

    /**
     * Appends a buffer into the EditHandler buffer.
     *
     * @param buffer the buffer containing data for copy
     * @param offset the offset in the buffer
     * @param length the value length of the buffer
     *
     * @exception NullPointerException if <code>buffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendArray(byte[] buffer,
                            short offset,
                            short length) throws NullPointerException,
                                                 ArrayIndexOutOfBoundsException,
                                                 ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (byte array format)
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value the buffer containing the TLV value
     * @param valueOffset the offset of the TLV value in the buffer
     * @param valueLength the value length of the TLV to append
     *
     * @exception NullPointerException if <code>value</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>valueOffset</code> or <code>valueLength</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendTLV(byte tag,
                          byte[] value,
                          short valueOffset,
                          short valueLength) throws NullPointerException,
                                                    ArrayIndexOutOfBoundsException,
                                                    ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (1-byte element)
     * (useful to add single byte elements as Item Identifier or Tone).
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value the TLV value on 1 byte
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendTLV(byte tag,
                          byte value) throws ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (2-byte element)
     * (useful to add double byte elements as Device Identities, Duration or
     * Response Length).
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value1 the 1st byte (msb) of the TLV value
     * @param value2 the 2nd byte (lsb) of the TLV value
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendTLV(byte tag,
                          byte value1,
                          byte value2) throws ToolkitException {
    }

    /**
     * Appends a TLV element to the current TLV list (1 byte and a byte array format).
     *
     * @param tag the tag of the TLV to append, including the Comprehension Required flag
     * @param value1 the first byte in the value field
     * @param value2 the buffer containing the rest of the TLV field
     * @param value2Offset the offset of the rest of the TLV field in the buffer
     * @param value2Length the value length of the rest of the TLV field to append
     *
     * @exception NullPointerException if <code>value2</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>value2Offset</code> or <code>value2Length</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public void appendTLV(byte tag,
                          byte value1,
                          byte[] value2,
                          short value2Offset,
                          short value2Length) throws NullPointerException,
                                                     ArrayIndexOutOfBoundsException,
                                                     ToolkitException {
    }
}
