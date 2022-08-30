//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.Shareable;

/**
 * The <b>SIMView interface</b> is the interface between the GSM System Services
 * and any applet (SIM Toolkit or other). It offers some methods to communicate
 * with the GSM System Services without compromising the GSM file system integrity 
 * (e.g. ME file context, conflicting access to files ...).
 * All the methods are based on the commands of the GSM11.11 specification.
 * This interface shall be implemented by a JCRE owned object. This 
 * interface is not intended for the activation of a SIM Toolkit applet.<p>
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF 
 *
 * @see javacard.framework.Shareable
 * @see SIMViewException
 */
public interface SIMView extends Shareable {

    // ------------------------------- Constants ------------------------------
    /** File identifier : MF = 0x3F00                                        */
    public static final short FID_MF                = (short)0x3F00;

    /** DF under MF                                                          */
    /** File identifier : DF TELECOM = 0x7F10                                */
    public static final short FID_DF_TELECOM        = (short)0x7F10;
    /** File identifier : DF GSM = 0x7F20                                    */
    public static final short FID_DF_GSM            = (short)0x7F20;
    /** File identifier : DF DCS-1800 = 0x7F21                               */
    public static final short FID_DF_DCS_1800       = (short)0x7F21;
    /** File identifier : DF IS-41 = 0x7F22                                  */
    public static final short FID_DF_IS_41          = (short)0x7F22;
    /** File identifier : DF FP-CTS = 0x7F23                                 */
    public static final short FID_DF_FP_CTS         = (short)0x7F23;

    /** DF under DF TELECOM                                                  */
    /** File identifier : DF Graphics = 0x5F50 (under DF TELECOM)            */
    public static final short FID_DF_Graphics       = (short)0x5F50;

    /** DF under DF GSM                                                      */
    /** File identifier : DF IRIDIUM = 0x5F30 (under DF GSM)                 */
    public static final short FID_DF_IRIDIUM        = (short)0x5F30;
    /** File identifier : DF Globalstar = 0x5F31 (under DF GSM)              */
    public static final short FID_DF_GLOBALSTAR     = (short)0x5F31;
    /** File identifier : DF ICO = 0x5F32 (under DF GSM)                     */
    public static final short FID_DF_ICO            = (short)0x5F32;
    /** File identifier : DF ACeS = 0x5F33 (under DF GSM)                    */
    public static final short FID_DF_ACES           = (short)0x5F33;
    /** File identifier : DF PCS-1900 = 0x5F40 (under DF GSM)                */
    public static final short FID_DF_PCS_1900       = (short)0x5F40;
    /** File identifier : DF CTS = 0x5F60 (under DF GSM)                     */
    public static final short FID_DF_CTS            = (short)0x5F60;
    /** File identifier : DF SoLSA = 0x5F70 (under DF GSM)                   */
    public static final short FID_DF_SOLSA          = (short)0x5F70;

    /** EF under MF                                                          */
    /** File identifier : EF ICCID = 0x2FE2 (under MF)                       */
    public static final short FID_EF_ICCID          = (short)0x2FE2;
    /** File identifier : EF ELP = 0x2F05 (under MF)                         */
    public static final short FID_EF_ELP            = (short)0x2F05;

    /** EF under DF TELECOM                                                  */
    /** File identifier : EF ADN = 0x6F3A (under DF TELECOM)                 */
    public static final short FID_EF_ADN            = (short)0x6F3A;
    /** File identifier : EF FDN = 0x6F3B (under DF TELECOM)                 */
    public static final short FID_EF_FDN            = (short)0x6F3B;
    /** File identifier : EF SMS = 0x6F3C (under DF TELECOM)                 */
    public static final short FID_EF_SMS            = (short)0x6F3C;
    /** File identifier : EF CCP = 0x6F3D (under DF TELECOM)                 */
    public static final short FID_EF_CCP            = (short)0x6F3D;
    /** File identifier : EF MSISDN = 0x6F40 (under DF TELECOM)              */
    public static final short FID_EF_MSISDN         = (short)0x6F40;
    /** File identifier : EF SMSP = 0x6F42 (under DF TELECOM)                */
    public static final short FID_EF_SMSP           = (short)0x6F42;
    /** File identifier : EF SMSS = 0x6F43 (under DF TELECOM)                */
    public static final short FID_EF_SMSS           = (short)0x6F43;
    /** File identifier : EF LND = 0x6F44 (under DF TELECOM)                 */
    public static final short FID_EF_LND            = (short)0x6F44;
    /** File identifier : EF SDN = 0x6F49 (under DF TELECOM)                 */
    public static final short FID_EF_SDN            = (short)0x6F49;
    /** File identifier : EF EXT1 = 0x6F4A (under DF TELECOM)                */
    public static final short FID_EF_EXT1           = (short)0x6F4A;
    /** File identifier : EF EXT2 = 0x6F4B (under DF TELECOM)                */
    public static final short FID_EF_EXT2           = (short)0x6F4B;
    /** File identifier : EF EXT3 = 0x6F4C (under DF TELECOM)                */
    public static final short FID_EF_EXT3           = (short)0x6F4C;
    /** File identifier : EF BDN = 0x6F4D (under DF TELECOM)                 */
    public static final short FID_EF_BDN            = (short)0x6F4D;
    /** File identifier : EF EXT4 = 0x6F4E (under DF TELECOM)                */
    public static final short FID_EF_EXT4           = (short)0x6F4E;
    /** File identifier : EF SMSR = 0x6F47 (under DF TELECOM)                */
    public static final short FID_EF_SMSR           = (short)0x6F47;

    /** EF under DF Graphics under DF TELECOM                                */
    /** File identifier : EF IMG = 0x4F20 (under DF Graphics)                */
    public static final short FID_EF_IMG            = (short)0x4F20;

    /** EF under DF GSM                                                      */
    /** File identifier : EF LP = 0x6F05 (under DF GSM)                      */
    public static final short FID_EF_LP             = (short)0x6F05;
    /** File identifier : EF IMSI = 0x6F07 (under DF GSM)                    */
    public static final short FID_EF_IMSI           = (short)0x6F07;
    /** File identifier : EF Kc = 0x6F20 (under DF GSM)                      */
    public static final short FID_EF_KC             = (short)0x6F20;
    /** File identifier : EF PLMNsel = 0x6F30 (under DF GSM)                 */
    public static final short FID_EF_PLMNSEL        = (short)0x6F30;
    /** File identifier : EF HPLMN = 0x6F31 (under DF GSM)                   */
    public static final short FID_EF_HPLMN          = (short)0x6F31;
    /** File identifier : EF ACMmax = 0x6F37 (under DF GSM)                  */
    public static final short FID_EF_ACMMAX         = (short)0x6F37;
    /** File identifier : EF SST = 0x6F38 (under DF GSM)                     */
    public static final short FID_EF_SST            = (short)0x6F38;
    /** File identifier : EF ACM = 0x6F39 (under DF GSM)                     */
    public static final short FID_EF_ACM            = (short)0x6F39;
    /** File identifier : EF GID1 = 0x6F3E (under DF GSM)                    */
    public static final short FID_EF_GID1           = (short)0x6F3E;
    /** File identifier : EF GID2 = 0x6F3F (under DF GSM)                    */
    public static final short FID_EF_GID2           = (short)0x6F3F;
    /** File identifier : EF SPN = 0x6F46 (under DF GSM)                     */
    public static final short FID_EF_SPN            = (short)0x6F46;
    /** File identifier : EF PUCT = 0x6F41 (under DF GSM)                    */
    public static final short FID_EF_PUCT           = (short)0x6F41;
    /** File identifier : EF CBMI = 0x6F45 (under DF GSM)                    */
    public static final short FID_EF_CBMI           = (short)0x6F45;
    /** File identifier : EF BCCH = 0x6F74 (under DF GSM)                    */
    public static final short FID_EF_BCCH           = (short)0x6F74;
    /** File identifier : EF ACC = 0x6F78 (under DF GSM)                     */
    public static final short FID_EF_ACC            = (short)0x6F78;
    /** File identifier : EF FPLMN = 0x6F7B (under DF GSM)                   */
    public static final short FID_EF_FPLMN          = (short)0x6F7B;
    /** File identifier : EF LOCI = 0x6F7E (under DF GSM)                    */
    public static final short FID_EF_LOCI           = (short)0x6F7E;
    /** File identifier : EF AD = 0x6FAD (under DF GSM)                      */
    public static final short FID_EF_AD             = (short)0x6FAD;
    /** File identifier : EF Phase = 0x6FAE (under DF GSM)                   */
    public static final short FID_EF_PHASE          = (short)0x6FAE;
    /** File identifier : EF VGCS = 0x6FB1 (under DF GSM)                    */
    public static final short FID_EF_VGCS           = (short)0x6FB1;
    /** File identifier : EF VGCSS = 0x6FB2 (under DF GSM)                   */
    public static final short FID_EF_VGCSS          = (short)0x6FB2;
    /** File identifier : EF VBS = 0x6FB3 (under DF GSM)                     */
    public static final short FID_EF_VBS            = (short)0x6FB3;
    /** File identifier : EF VBSS = 0x6FB4 (under DF GSM)                    */
    public static final short FID_EF_VBSS           = (short)0x6FB4;
    /** File identifier : EF eMLPP = 0x6FB5 (under DF GSM)                   */
    public static final short FID_EF_EMLPP          = (short)0x6FB5;
    /** File identifier : EF AAeM = 0x6FB6 (under DF GSM)                    */
    public static final short FID_EF_AAEM           = (short)0x6FB6;
    /** File identifier : EF CBMID = 0x6F48 (under DF GSM)                   */
    public static final short FID_EF_CBMID          = (short)0x6F48;
    /** File identifier : EF ECC = 0x6FB7 (under DF GSM)                     */
    public static final short FID_EF_ECC            = (short)0x6FB7;
    /** File identifier : EF CBMIR = 0x6F50 (under DF GSM)                   */
    public static final short FID_EF_CBMIR          = (short)0x6F50;
    /** File identifier : EF DCK = 0x6F2C (under DF GSM)                     */
    public static final short FID_EF_DCK            = (short)0x6F2C;
    /** File identifier : EF CNL = 0x6F32 (under DF GSM)                     */
    public static final short FID_EF_CNL            = (short)0x6F32;
    /** File identifier : EF NIA = 0x6F51 (under DF GSM)                     */
    public static final short FID_EF_NIA            = (short)0x6F51;
    /** File identifier : EF KcGPRS = 0x6F52 (under DF GSM)                  */
    public static final short FID_EF_KCGPRS         = (short)0x6F52;
    /** File identifier : EF LOCIGPRS = 0x6F53 (under DF GSM)                */
    public static final short FID_EF_LOCIGPRS       = (short)0x6F53;
    /** File identifier : EF SUME = 0x6F54 (under DF GSM)                    */
    public static final short FID_EF_SUME           = (short)0x6F54;

    /** EF under DF SoSA (under DF GSM)                                      */
    /** File identifier : EF SAI = 0x4F30 (under DF SoLSA)                   */
    public static final short FID_EF_SAI            = (short)0x4F30;
    /** File identifier : EF SLL = 0x4F31 (under DF SoLSA)                   */
    public static final short FID_EF_SLL            = (short)0x4F31;

    /** Record access mode : next record = 0x02                              */
    public static final byte REC_ACC_MODE_NEXT              = (byte)0x02;
    /** Record access mode : previous record = 0x03                          */
    public static final byte REC_ACC_MODE_PREVIOUS          = (byte)0x03;
    /** Record access mode : absolute/current record = 0x04                  */
    public static final byte REC_ACC_MODE_ABSOLUTE_CURRENT  = (byte)0x04;

    /** Seek mode : from the beginning forward = 0x00                        */
    public static final byte SEEK_FROM_BEGINNING_FORWARD = (byte)0x00;
    /** Seek mode : from the end backward = 0x01                             */
    public static final byte SEEK_FROM_END_BACKWARD      = (byte)0x01;
    /** Seek mode : from the next location forward = 0x02                    */
    public static final byte SEEK_FROM_NEXT_FORWARD      = (byte)0x02;
    /** Seek mode : from the previous location backward = 0x03               */
    public static final byte SEEK_FROM_PREVIOUS_BACKWARD = (byte)0x03;


    // ------------------------------- API methods ----------------------------
    /**
     * SELECT command as defined in GSM 11.11 standard.<br>
     * By default, the MF is selected at the beginning of each applet activation
     * (current file = MF). This method selects a file of the GSM file system.
     * The file search starts at the current DF of the applet according to
     * the file search method described in GSM 11.11 specification. The current
     * DF or current EF and the current record pointer of the calling applet will
     * be changed after successful execution.
     *
     * @param fid is the File Identifier of the file to be selected.
     * @param fci is the reference to the target byte array for FCI (File Control
     *        Information) of current file, coding is according to GSM 11.11.
     *        If <code>fci</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>fci</code> buffer is too small to receive the whole response, no
     *        exception is thrown and the response is truncated.
     * @param fciOffset is the offset in the <code>fci</code> buffer for the response data
     * @param fciLength is the length of the required data in the <code>fci</code> byte array
     *
     * @return length of the data which have been written in the <code>fci</code> buffer
     *         (cannot be greater than <code>fci</code> buffer size)
     *
     * @exception NullPointerException if <code>fci</code> is <code>null</code>
     * @exception SIMViewException in case of error<ul>
     *          <li><code>FILE_NOT_FOUND</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *          <li><code>INTERNAL_ERROR</code></ul>
     */
    public short select(short fid,
                        byte  fci[],
                        short fciOffset,
                        short fciLength) throws NullPointerException,
                                                SIMViewException;

    /**
     * SELECT command as defined in GSM 11.11 standard.<br>
     * This SELECT method allows to update the current file without handling the
     * Select Response
     * By default, the MF is selected at the beginning of each applet activation
     * (current file = MF). This method selects a file of the common GSM file
     * system. The file search starts at the current DF of the applet according
     * to the file search method described in GSM 11.11 specification. The current
     * DF or current EF and the current record pointer of the calling applet will
     * be changed after successful execution.
     *
     * @param fid is the File Identifier of the file to be selected.
     *
     * @exception SIMViewException in case of error <ul>
     *     		<li><code>FILE_NOT_FOUND</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *     		<li><code>INTERNAL_ERROR</code></ul>
     */
    public void select(short fid) throws SIMViewException;

    /**
     * STATUS command as defined in GSM 11.11 standard.<br>
     * This method returns the FCI (File Control Information) of the current DF
     * (or MF) of the calling applet.
     *
     * @param fci is the reference to the target byte array for FCI (File Control
     *        Information) of current DF (or MF), coding is according to GSM 11.11.
     *        If <code>fci</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>fci</code> buffer is too small to receive the whole response, no
     *        exception is thrown and the response is truncated.
     * @param fciOffset is the offset in the <code>fci</code> buffer for the response data
     * @param fciLength is the length of the required data in the <code>fci</code> byte array
     *
     * @return length of the data which have been written in the <code>fci</code> buffer
     *         (cannot be greater than <code>fci</code> buffer size)
     *
     * @exception NullPointerException if <code>fci</code> is <code>null</code>
     * @exception SIMViewException in case of error <ul>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short status(byte  fci[],
                        short fciOffset,
                        short fciLength) throws NullPointerException,
                                                SIMViewException;

    /**
     * READ BINARY command as defined in GSM 11.11 standard.<br>
     * This method reads the data bytes of the current transparent EF of the
     * calling applet.
     *
     * @param fileOffset is the offset in the source transparent file.
     * @param resp is the reference to the response byte array for read data.
     *        If <code>resp</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>respOffset</code> or <code>respLength</code> or <code>respOffset+resLength</code> is in contradiction
     *        to the <code>resp</code> byte array the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     * @param respOffset is the offset in the response byte array.
     * @param respLength is the number of bytes to read.
     *
     * @return <code>respOffset+respLength</code>
     *
     * @exception NullPointerException if <code>resp</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if reading would cause access of data outside array bounds
     * @exception SIMViewException in case of error <ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_FILE_BOUNDARIES</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short readBinary(short fileOffset,
                            byte  resp[],
                            short respOffset,
                            short respLength) throws NullPointerException,
                                                     ArrayIndexOutOfBoundsException,
                                                     SIMViewException;

    /**
     * UPDATE BINARY command as defined in GSM 11.11 standard.<br>
     * This method updates the data bytes of the current transparent EF of
     * the calling applet.
     *
     * @param fileOffset is the offset in the destination transparent file.
     * @param data is the reference to the source byte array for data to update.
     *        If <code>data</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>dataOffset</code> or <code>dataLength</code> or <code>dataOffset+dataLength</code> is in contradiction
     *        to the <code>data</code> byte array the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     * @param dataOffset is the offset in the source byte array.
     * @param dataLength is the number of bytes to update.
     *
     * @exception NullPointerException if <code>data</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if updating would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_FILE_BOUNDARIES</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void updateBinary(short fileOffset,
                             byte  data[],
                             short dataOffset,
                             short dataLength) throws   NullPointerException,
                                                        ArrayIndexOutOfBoundsException,
                                                        SIMViewException;

    /**
     * READ RECORD command as defined in GSM 11.11 standard.<br>
     * This method reads the data bytes of the current linear fixed/cyclic EF
     * of the calling applet. The current record pointer can be changed due to
     * the choosen mode.
     *
     * @param recNumber is the record number.
     * @param mode is the mode for reading record, according to GSM 11.11.
     * @param recOffset is the offset in the record for the data to read.
     * @param resp is the reference to the response byte array for read data.
     *        If <code>resp</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>respOffset</code> or <code>respLength</code> or <code>respOffset+resLength</code> is in contradiction
     *        to the <code>resp</code> byte array the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     * @param respOffset is the offset in the response byte array.
     * @param respLength is the number of bytes to read.
     *
     * @return <code>respOffset+respLength</code>
     *
     * @exception NullPointerException if <code>resp</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if reading would cause access of data outside array bounds
     * @exception SIMViewException in case of error <ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_RECORD_BOUNDARIES</code>
     *      	<li><code>RECORD_NUMBER_NOT_AVAILABLE</code>
     *      	<li><code>INVALID_MODE</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short readRecord(short recNumber,
                            byte  mode,
                            short recOffset,
                            byte  resp[],
                            short respOffset,
                            short respLength) throws     NullPointerException,
                                                         ArrayIndexOutOfBoundsException,
                                                         SIMViewException;

    /**
     * UPDATE RECORD command as defined in GSM 11.11 standard.<br>
     * This method updates the data bytes of the current linear fixed/cyclic EF
     * of the calling applet. The current record pointer can be changed due to
     * the choosen mode.
     *
     * @param recNumber is the record number.
     * @param mode is the mode for updating record, according to GSM 11.11.
     * @param recOffset is the offset in the record for the data to update.
     * @param data is the reference to the source byte array for data to update.
     *        If <code>data</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>dataOffset</code> or <code>dataLength</code> or <code>dataOffset+dataLength</code> is in contradiction
     *        to the <code>data</code> byte array the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     * @param dataOffset is the offset in the source byte array.
     * @param dataLength is the number of bytes to update.
     *
     * @exception NullPointerException if <code>data</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if updating would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>OUT_OF_RECORD_BOUNDARIES</code>
     *      	<li><code>RECORD_NUMBER_NOT_AVAILABLE</code>
     *      	<li><code>INVALID_MODE</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void updateRecord(short recNumber,
                             byte  mode,
                             short recOffset,
                             byte  data[],
                             short dataOffset,
                             short dataLength) throws   NullPointerException,
                                                        ArrayIndexOutOfBoundsException,
                                                        SIMViewException;

    /**
     * SEEK command as defined in GSM 11.11 standard.<br>
     * This method seeks a pattern in the current linear fixed EF of the calling
     * applet.
     *
     * @param mode is the seek mode, according to GSM 11.11 (no type information).
     * @param patt is the reference to the byte array containing the seek pattern.
     *        If <code>patt</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>pattOffset</code> or <code>pattLength</code> or <code>pattOffset+pattLength</code> is in contradiction
     *        to the <code>patt</code> byte array the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     * @param pattOffset is the offset of the seek pattern in the byte array.
     * @param pattLength is the length of the seek pattern.
     *
     * @return record number if pattern found
     *
     * @exception NullPointerException if <code>patt</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if seeking would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>PATTERN_NOT_FOUND</code>
	 *			<li><code>PATTERN_SIZE_INCONSISTENT</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>INVALID_MODE</code>
     *      	<li><code>OUT_OF_RECORD_BOUNDARIES</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short seek(byte   mode,
                      byte[] patt,
                      short  pattOffset,
                      short  pattLength) throws  NullPointerException,
                                                ArrayIndexOutOfBoundsException,
                                                SIMViewException;

    /**
     * INCREASE command as defined in GSM 11.11 standard.<br>
     * This method increases the current cyclic EF record of the calling applet.
     * The response buffer will only contain the value of the increased record.
     *
     * @param incr is the reference to the source byte array, containing the
     *        value to add, on 3 bytes.
     * @param incrOffset is the offset in the source byte array.
     * @param resp is the reference to the response byte array for new record value.
     *        If <code>incr</code> or <code>resp</code> is <code>null</code> the <code>NullPointerException</code> is thrown.
     *        If <code>resp</code> buffer is smaller than the record size, the <code>ArrayIndexOutOfBoundsException</code> is thrown.
     *        If <code>resp</code> buffer is bigger than the record size, the <code>resp</code> buffer is filled
     *        with the record value and left justified
     * @param respOffset is the offset in the response byte array.
     *
     * @return length of the valid data in the <code>resp</code> buffer
     *      (cannot be greater than the record size)
     *
     * @exception NullPointerException if <code>incr</code> or <code>resp</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if increasing would cause access of data outside array bounds
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>FILE_INCONSISTENT</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *      	<li><code>MAX_VALUE_REACHED</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public short increase(byte[] incr,
                          short  incrOffset,
                          byte[] resp,
                          short  respOffset) throws  NullPointerException,
                                                    ArrayIndexOutOfBoundsException,
                                                    SIMViewException;

    /**
     * INVALIDATE command as defined in GSM 11.11 standard.<br>
     * This method invalidates the currently selected EF of the calling applet.
     *
     * @exception SIMViewException in case of error<ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void invalidate() throws SIMViewException;

    /**
     * REHABILITATE command as defined in GSM 11.11 standard.<br>
     * This method rehabilitates the currently selected EF of the calling applet.
     *
     * @exception SIMViewException in case of error <ul>
     *      	<li><code>NO_EF_SELECTED</code>
     *      	<li><code>AC_NOT_FULFILLED</code>
     *      	<li><code>INVALIDATION_STATUS_CONTRADICTION</code>
     *          <li><code>MEMORY_PROBLEM</code>
     *      	<li><code>INTERNAL_ERROR</code></ul>
     */
    public void rehabilitate() throws SIMViewException;
}
