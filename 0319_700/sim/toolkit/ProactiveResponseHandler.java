//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The ProactiveResponseHandler class contains basic methods to handle the <b>Terminal
 * Response</b> data field. This class will be used by the Toolkit applet to
 * get the response to the Proactive commands. No constructor is available for
 * the Toolkit applet. The ProactiveResponseHandler class is a <b>Temporary JCRE 
 * Entry Point Object</b>. The only way to get a ProactiveResponseHandler 
 * reference is through the <code>getTheHandler()</code> static method.<p>
 *
 * Example of use:<pre><code>
 *
 * private byte[] data;
 * data = new byte[32];                 // build a buffer
 *
 * ProactiveResponseHandler ProRespHdlr;            // get the system instance
 * ProRespHdlr = ProactiveResponseHandler.getTheHandler();
 *
 * // get General Result
 * byte result = ProRespHdlr.getGeneralResult();
 *
 * respHdlr.findTLV(TAG_DEVICE_IDENTITIES, 1);          // look for Device Identities
 * byte sourceDev = ProRespHdlr.getValueByte((short)0);    // read Device Identities
 * byte destinDev = ProRespHdlr.getValueByte((short)1);
 *
 *                                                      // look for Text String element
 * if (ProRespHdlr.findTLV(TAG_TEXT_STRING, (byte)1) == TLV_FOUND_CR_SET) {
 *     if ((short len = ProRespHdlr.getValueLength()) > 1) {
 *         // not empty string: to be copied
 *         ProRespHdlr.copyValue((short)1, data, (short)0, (short)(len - 1));
 *     }
 * }
 * </code></pre>
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF
 * @see ViewHandler
 * @see ProactiveHandler
 * @see ToolkitException
 */
public final class ProactiveResponseHandler extends ViewHandler {

    // ------------------------------- Constructors ---------------------------
    /**
     * Constructor
     */
    private ProactiveResponseHandler() {
    }


    // ------------------------------- Public methods -------------------------
    /**
     * Returns the single system instance of the ProactiveResponseHandler class. 
     * The applet shall get the reference of the handler at its triggering, 
     * the beginning of the processToolkit method.
     *
     * @return reference of the system instance
	 *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy.</ul>
     */
    public static ProactiveResponseHandler getTheHandler() throws ToolkitException {
    }

    /**
     * Returns the general result byte of the Proactive command.
     *
     * @return general result of the command (first byte of Result TLV in Terminal Response)
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element</ul>
     */
    public byte getGeneralResult() throws ToolkitException {
    }

    /**
     * Returns the length of the additional information field from the first
     * Result TLV element of the current response data field.
     *
     * @return additional information length
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element</ul>
     */
    public short getAdditionalInformationLength() throws ToolkitException {
    }

    /**
     * Copies a part of the additional information field from the first Result
     * TLV element of the current response data field.
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
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element</ul>
     */
    public short copyAdditionalInformation(byte[] dstBuffer, 
    										short dstOffset, 
    										short dstLength) throws NullPointerException,
                                                     				ArrayIndexOutOfBoundsException,
                                                     				ToolkitException {
    }

    /**
     * Returns the item identifier byte value from the first Item Identifier TLV
     * element of the current response data field.
     *
     * @return item identifier
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Item Identifier TLV element</ul>
     */
    public byte getItemIdentifier() throws ToolkitException {
    }

    /**
     * Returns the text string length value from the first Text String TLV
     * element of the current response data field. The Data Coding Scheme byte
     * is not taken into account.
     *
     * @return text string length
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Text String TLV element</ul>
     */
    public short getTextStringLength() throws ToolkitException {
    }

    /**
     * Returns the data coding scheme byte from the first Text String TLV
     * element of the current response data field.
     *
     * @return text string coding scheme
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Text String TLV element</ul>
     */
    public byte getTextStringCodingScheme() throws ToolkitException {
    }

    /**
     * Copies the text string value from the first Text String TLV element of the
     * current response data field. The Data Coding Scheme byte is not copied.
     *
     * @param dstBuffer a reference to the destination buffer
     * @param dstOffset the position in the destination buffer
     *
     * @return <code>dstOffset</code> + length of the copied value
     *
     * @exception NullPointerException if <code>dstBuffer</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>dstOffset</code> would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Text String TLV element</ul>
     */
    public short copyTextString(byte[] dstBuffer, short dstOffset) 
    												throws 	NullPointerException,
                                                     		ArrayIndexOutOfBoundsException,
                                                     		ToolkitException {
    }
}
