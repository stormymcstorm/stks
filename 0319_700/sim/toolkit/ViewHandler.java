//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The ViewHandler class offers basic services and contains basic methods to handle
 * a Simple TLV, such as in a <b>Terminal Response</b> data field or in a BER-TLV
 * element (<b>Envelope</b> data field or <b>Proactive</b> command).
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF
 *
 * @see ToolkitException
 */
public class ViewHandler {

    ViewHandler() {}

    // ------------------------------- Constructor ---------------------------
    /**
     * Builds a new ViewHandler object.
     *
     * @param buffer a reference to the TLV buffer
     * @param offset the position in the TLV buffer
     * @param length the length of the TLV buffer
	 *
     * @exception NullPointerException if <code>buffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     */
    public ViewHandler(byte[] buffer, short offset, short length)
    												throws 	NullPointerException,
                                                    		ArrayIndexOutOfBoundsException  {
    }

    // ------------------------------- Public methods -------------------------
    /**
     * Returns the length of the TLV list.
     *
     * @return length in bytes
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *          <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public short getLength() throws ToolkitException {
        return 0;
    }

    /**
     * Copies the simple TLV list contained in the handler to the destination byte array.
     *
     * @param dstBuffer a reference to the destination buffer
     * @param dstOffset the position in the destination buffer
     * @param dstLength the data length to be copied
     *
     * @return <code>dstOffset+dstLength</code>
     *
     * @exception NullPointerException if <code>dstBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>dstOffset</code> or <code>dstLength</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>dstLength</code> is grater than the length of the simple TLV List.</ul>
     */
    public short copy(	byte[] dstBuffer,
                        short dstOffset,
                        short dstLength) throws NullPointerException,
                                                ArrayIndexOutOfBoundsException,
                                                ToolkitException {
        return 0;
    }


    /**
     * Looks for the indicated occurence of a TLV element from the beginning of
     * the TLV list (handler buffer). If the method is successful than the
     * corresponding TLV becomes current, else no TLV is selected.
     * This search method is Comprehension Required flag independent.
     *
     * @param tag the tag of the TLV element to search
     * @param occurrence the occurrence number of the TLV element (1 for the first, 2 for the second...)
     *
     * @return result of the method: <ul>
     *      <li><code>TLV_NOT_FOUND</code> if the required occurrence of the TLV element does not exist
     *      <li><code>TLV_FOUND_CR_SET</code> if the required occurence exists and Comprehension Required flag is set
     *      <li><code>TLV_FOUND_CR_NOT_SET</code> if the required occurence exists and Comprehension Required flag is not set</ul>
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
     */
    public byte findTLV(byte tag, byte occurrence) throws ToolkitException {
        return 0;
    }

    /**
     * Gets the length of the value field for the last TLV element which has
     * been found in the handler.
     *
     * @return length of the value field
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
     */
    public short getValueLength() throws ToolkitException {
        return 0;
    }

    /**
     * Gets a byte from the last TLV element which has been found in the handler.
     *
     * @param valueOffset the offset of the byte to return in the TLV element
     *
     * @return element value (1 byte)
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code> is out of the current TLV </ul>
     */
    public byte getValueByte(short valueOffset) throws ToolkitException {
        return 0;
    }

    /**
     * Copies a part of the last TLV element which has been found, into a
     * destination buffer.
     *
     * @param valueOffset the offset of the first byte in the source TLV element
     * @param dstBuffer a reference to the destination buffer
     * @param dstOffset the position in the destination buffer
     * @param dstLength the data length to be copied
     *
     * @return <code>dstOffset+dstLength</code>
     *
     * @exception NullPointerException if <code>dstBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>dstOffset</code> or <code>dstLength</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, length or both are out of the current TLV </ul>
     */
    public short copyValue( short valueOffset,
                            byte[] dstBuffer,
                            short dstOffset,
                            short dstLength) throws NullPointerException,
                                                	ArrayIndexOutOfBoundsException,
                                                	ToolkitException {
        return 0;
    }

    /**
     * Compares the last found TLV element with a buffer.
     *
     * @param valueOffset the offset of the first byte to compare in the TLV element
     * @param compareBuffer a reference to the comparison buffer
     * @param compareOffset the position in the comparison buffer
     * @param compareLength the length to be compared
     *
     * @return the result of the comparison as follows: <ul>
     *      <li><code>0</code> if identical
     *      <li><code>-1</code> if the first miscomparing byte in TLV element array is less than that in destination array,
     *      <li><code>1</code> if the first miscomparing byte in TLV element array is greater than that in destination array.</ul>
     *
     * @exception NullPointerException if <code>compareBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>compareOffset</code> or <code>compareLength</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, length or both are out of the current TLV </ul>
     */
    public byte compareValue(short valueOffset,
                             byte[] compareBuffer,
                             short compareOffset,
                             short compareLength) throws 	NullPointerException,
                                                			ArrayIndexOutOfBoundsException,
                                                			ToolkitException {
        return 0;
    }

    /**
     * Looks for the first occurence of a TLV element from the beginning of a TLV
     * list and copy its value into a destination buffer.
     * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
     * If the method is successful than the corresponding TLV becomes current,
     * else no TLV is selected.
     * This search method is Comprehension Required flag independent.
     *
     * @param tag the tag of the TLV element to search
     * @param dstBuffer a reference to the destination buffer
     * @param dstOffset the position in the destination buffer
     *
     * @return <code>dstOffset</code> + length of the copied value
     *
     * @exception NullPointerException if <code>dstBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>dstOffset</code> would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
     */
    public short findAndCopyValue(byte tag,
                                  byte[] dstBuffer,
                                  short dstOffset) throws 	NullPointerException,
                                                			ArrayIndexOutOfBoundsException,
                                                			ToolkitException {
        return 0;
    }

    /**
     * Looks for the indicated occurence of a TLV element from the beginning of a TLV
     * list and copy its value into a destination buffer.
     * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
     * If the method is successful than the corresponding TLV becomes current,
     * else no TLV is selected.
     * This search method is Comprehension Required flag independent.
     *
     * @param tag the tag of the TLV element to search
     * @param occurrence the occurrence number of the TLV element (1 for the first, 2 for the second...)
     * @param valueOffset the offset of the first byte in the source TLV element
     * @param dstBuffer a reference to the destination buffer
     * @param dstOffset the position in the destination buffer
     * @param dstLength the data length to be copied
     *
     * @return <code>dstOffset + dstLength</code>
     *
     * @exception NullPointerException if <code>dstBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>dstOffset</code> or <code>dstLength</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, length or both are out of the current TLV </ul>
     */
    public short findAndCopyValue(byte tag,
                                  byte occurence,
                                  short valueOffset,
                                  byte[] dstBuffer,
                                  short dstOffset,
                                  short dstLength) throws 	NullPointerException,
                                                			ArrayIndexOutOfBoundsException,
                                                			ToolkitException {
        return 0;
    }

    /**
     * Looks for the first occurence of a TLV element from beginning of a TLV
     * list and compare its value with a buffer.
     * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
     * If the method is successful than the corresponding TLV becomes current,
     * else no TLV is selected.
     * This search method is Comprehension Required flag independent.
     *
     * @param tag the tag of the TLV element to search
     * @param compareBuffer a reference to the comparison buffer
     * @param compareOffset the position in the comparison buffer
     *
     * @return the result of the comparison as follows: <ul>
     *      <li><code>0</code> if identical
     *      <li><code>-1</code> if the first miscomparing byte in TLV element array is less than that in destination array,
     *      <li><code>1</code> if the first miscomparing byte in TLV element array is greater than that in destination array.</ul>
     *
     * @exception NullPointerException if <code>compareBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>compareOffset</code> would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
     */
    public byte findAndCompareValue(byte tag,
                                    byte[] compareBuffer,
                                    short compareOffset) throws	NullPointerException,
                                                				ArrayIndexOutOfBoundsException,
                                                				ToolkitException {
        return 0;
    }

    /**
     * Looks for the indicated occurence of a TLV element from the beginning of a
     * TLV list and compare its value with a buffer.
     * If no TLV element is found, the UNAVAILABLE_ELEMENT exception is thrown.
     * If the method is successful than the corresponding TLV becomes current,
     * else no TLV is selected.
     * This search method is Comprehension Required flag independent.
     *
     * @param tag the tag of the TLV element to search
     * @param occurrence the occurrence number of the TLV element (1 for the first, 2 for the second...)
     * @param valueOffset the offset of the first byte in the source TLV element
     * @param compareBuffer a reference to the comparison buffer
     * @param compareOffset the position in the comparison buffer
     * @param compareLength the length to be compared
     *
     * @return the result of the comparison as follows: <ul>
     *      <li><code>0</code> if identical
     *      <li><code>-1</code> if the first miscomparing byte in TLV element array is less than that in destination array,
     *      <li><code>1</code> if the first miscomparing byte in TLV element array is greater than that in destination array.</ul>
     *
     * @exception NullPointerException if <code>compareBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>compareOffset</code> or <code>compareLength</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
     *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, length or both are out of the current TLV </ul>
     */
    public byte findAndCompareValue(byte tag,
                                    byte occurence,
                                    short valueOffset,
                                    byte[] compareBuffer,
                                    short compareOffset,
                                    short compareLength) throws NullPointerException,
                                                				ArrayIndexOutOfBoundsException,
                                                				ToolkitException {
        return 0;
    }
}
