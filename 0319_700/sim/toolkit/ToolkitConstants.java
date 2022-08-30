//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.*;

/**
 *
 * <code>ToolkitConstants</code> encapsulates constants related to the Toolkit applets.
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF
 */
 public interface ToolkitConstants
{
    // --------------------------- Events Constants --------------------------
    /** Event : Profile Download  = 1                                       */
    public static final byte EVENT_PROFILE_DOWNLOAD                     = (byte)1;
    /** Event : Envelope SMS-PP Data Download (03.48 formatted)  = 2        */
    public static final byte EVENT_FORMATTED_SMS_PP_ENV                 = (byte)2;
    /** Event : Update Record EF sms APDU     (03.48 formatted)  = 3        */
    public static final byte EVENT_FORMATTED_SMS_PP_UPD                 = (byte)3;
    /** Event : Envelope SMS-PP Data Download unformatted sms  = 4          */
    public static final byte EVENT_UNFORMATTED_SMS_PP_ENV               = (byte)4;
    /** Event : Update Record EFsms APDU      unformatted sms   = 5         */
    public static final byte EVENT_UNFORMATTED_SMS_PP_UPD               = (byte)5;
    /** Event : Cell Broadcast Data Download  = 6                           */
    public static final byte EVENT_UNFORMATTED_SMS_CB                   = (byte)6;
    /** Event : Menu Selection  = 7                                         */
    public static final byte EVENT_MENU_SELECTION                       = (byte)7;
    /** Event : Menu Selection Help Request = 8                             */
    public static final byte EVENT_MENU_SELECTION_HELP_REQUEST          = (byte)8;
    /** Event : Call Control by SIM = 9                                     */
    public static final byte EVENT_CALL_CONTROL_BY_SIM                  = (byte)9;
    /** Event : MO Short Message Control by SIM = 10                        */
    public static final byte EVENT_MO_SHORT_MESSAGE_CONTROL_BY_SIM      = (byte)10;
    /** Event : Timer Expiration = 11                                       */
    public static final byte EVENT_TIMER_EXPIRATION                     = (byte)11;
    /** Event : Event Download - MT call type = 12                          */
    public static final byte EVENT_EVENT_DOWNLOAD_MT_CALL               = (byte)12;
    /** Event : Event Download - Call connected type = 13                   */
    public static final byte EVENT_EVENT_DOWNLOAD_CALL_CONNECTED        = (byte)13;
    /** Event : Event Download - Call disconnected type = 14                */
    public static final byte EVENT_EVENT_DOWNLOAD_CALL_DISCONNECTED     = (byte)14;
    /** Event : Event Download - Location status type = 15                  */
    public static final byte EVENT_EVENT_DOWNLOAD_LOCATION_STATUS       = (byte)15;
    /** Event : Event Download - User activity type = 16                    */
    public static final byte EVENT_EVENT_DOWNLOAD_USER_ACTIVITY         = (byte)16;
    /** Event : Event Download - Idle screen available type = 17            */
    public static final byte EVENT_EVENT_DOWNLOAD_IDLE_SCREEN_AVAILABLE = (byte)17;
    /** Event : Event Download - Card Reader Status = 18                    */
    public static final byte EVENT_EVENT_DOWNLOAD_CARD_READER_STATUS    = (byte)18;
    /** Event : Status APDU command = 127                                   */
    public static final byte EVENT_STATUS_COMMAND                       = (byte)127;
    /** Event : Unrecognized Envelope = 128                                 */
    public static final byte EVENT_UNRECOGNIZED_ENVELOPE                = (byte)128;

    /** Event : Proprietary events reserved range = [-127, -1]              */


    // -------------------------- BER-TLV Constants -------------------------
    /** BER-TLV : Proactive SIM command tag                          = 0xD0 */
    public static final byte BTAG_PROACTIVE_SIM_COMMAND              = (byte)0xD0;
    /** BER-TLV : SMS-PP download tag                                = 0xD1 */
    public static final byte BTAG_SMS_PP_DOWNWLOAD                   = (byte)0xD1;
    /** BER-TLV : Cell Broadcast download tag                        = 0xD2 */
    public static final byte BTAG_CELL_BROADCAST_DOWNLOAD            = (byte)0xD2;
    /** BER-TLV : Menu Selection tag                                 = 0xD3 */
    public static final byte BTAG_MENU_SELECTION                     = (byte)0xD3;
    /** BER-TLV : Call Control tag                                   = 0xD4 */
    public static final byte BTAG_CALL_CONTROL                       = (byte)0xD4;
    /** BER-TLV : MO short message control tag                       = 0xD5 */
    public static final byte BTAG_MO_SHORT_MESSAGE_CONTROL           = (byte)0xD5;
    /** BER-TLV : Event download tag                                 = 0xD6 */
    public static final byte BTAG_EVENT_DOWNLOAD                     = (byte)0xD6;
    /** BER-TLV : Timer Expiration tag                               = 0xD7 */
    public static final byte BTAG_TIMER_EXPIRATION                   = (byte)0xD7;

    // ------------------------ Simple-TLV Constants -------------------------
    /** Simple-TLV : Command Details tag                             = 0x01 */
    public static final byte TAG_COMMAND_DETAILS                     = (byte)0x01;
    /** Simple-TLV : Device Identities tag                           = 0x02 */
    public static final byte TAG_DEVICE_IDENTITIES                   = (byte)0x02;
    /** Simple-TLV : Result tag                                      = 0x03 */
    public static final byte TAG_RESULT                              = (byte)0x03;
    /** Simple-TLV : Duration tag                                    = 0x04 */
    public static final byte TAG_DURATION                            = (byte)0x04;
    /** Simple-TLV : Alpha Identifier tag                            = 0x05 */
    public static final byte TAG_ALPHA_IDENTIFIER                    = (byte)0x05;
    /** Simple-TLV : Address tag                                     = 0x06 */
    public static final byte TAG_ADDRESS                             = (byte)0x06;
    /** Simple-TLV : Capability Configuration Parameters tag         = 0x07 */
    public static final byte TAG_CAPABILITY_CONFIGURATION_PARAMETERS = (byte)0x07;
    /** Simple-TLV : Called Party Subaddress tag                     = 0x08 */
    public static final byte TAG_CALLED_PARTY_SUBADDRESS             = (byte)0x08;
    /** Simple-TLV : SS String tag                                   = 0x09 */
    public static final byte TAG_SS_STRING                           = (byte)0x09;
    /** Simple-TLV : USSD String tag                                 = 0x0A */
    public static final byte TAG_USSD_STRING                         = (byte)0x0A;
    /** Simple-TLV : SMS TPDU tag                                    = 0x0B */
    public static final byte TAG_SMS_TPDU                            = (byte)0x0B;
    /** Simple-TLV : Cell Broadcast Page tag                         = 0x0C */
    public static final byte TAG_CELL_BROADCAST_PAGE                 = (byte)0x0C;
    /** Simple-TLV : Text String tag                                 = 0x0D */
    public static final byte TAG_TEXT_STRING                         = (byte)0x0D;
    /** Simple-TLV : Tone tag                                        = 0x0E */
    public static final byte TAG_TONE                                = (byte)0x0E;
    /** Simple-TLV : Item tag                                        = 0x0F */
    public static final byte TAG_ITEM                                = (byte)0x0F;
    /** Simple-TLV : Item Identifier tag                             = 0x10 */
    public static final byte TAG_ITEM_IDENTIFIER                     = (byte)0x10;
    /** Simple-TLV : Response Length tag                             = 0x11 */
    public static final byte TAG_RESPONSE_LENGTH                     = (byte)0x11;
    /** Simple-TLV : File List tag                                   = 0x12 */
    public static final byte TAG_FILE_LIST                           = (byte)0x12;
    /** Simple-TLV : Location Information tag                        = 0x13 */
    public static final byte TAG_LOCATION_INFORMATION                = (byte)0x13;
    /** Simple-TLV : IMEI tag                                        = 0x14 */
    public static final byte TAG_IMEI                                = (byte)0x14;
    /** Simple-TLV : Help Request tag                                = 0x15 */
    public static final byte TAG_HELP_REQUEST                        = (byte)0x15;
    /** Simple-TLV : Network Measurement Results tag                 = 0x16 */
    public static final byte TAG_NETWORK_MEASUREMENT_RESULTS         = (byte)0x16;
    /** Simple-TLV : Default Text tag                                = 0x17 */
    public static final byte TAG_DEFAULT_TEXT                        = (byte)0x17;
    /** Simple-TLV : Items Next Action Indicator tag                 = 0x18 */
    public static final byte TAG_ITEMS_NEXT_ACTION_INDICATOR         = (byte)0x18;
    /** Simple-TLV : Event List tag                                  = 0x19 */
    public static final byte TAG_EVENT_LIST                          = (byte)0x19;
    /** Simple-TLV : Cause tag                                       = 0x1A */
    public static final byte TAG_CAUSE                               = (byte)0x1A;
    /** Simple-TLV : Location Status tag                             = 0x1B */
    public static final byte TAG_LOCATION_STATUS                     = (byte)0x1B;
    /** Simple-TLV : Transaction Identifier tag                      = 0x1C */
    public static final byte TAG_TRANSACTION_IDENTIFIER              = (byte)0x1C;
    /** Simple-TLV : BCCH Channel List tag                           = 0x1D */
    public static final byte TAG_BCCH_CHANNEL_LIST                   = (byte)0x1D;
    /** Simple-TLV : Icon Identifier tag                             = 0x1E */
    public static final byte TAG_ICON_IDENTIFIER                     = (byte)0x1E;
    /** Simple-TLV : Item Icon Identifier list tag                   = 0x1F */
    public static final byte TAG_ITEM_ICON_IDENTIFIER_LIST           = (byte)0x1F;
    /** Simple-TLV : Card Reader status tag                          = 0x20 */
    public static final byte TAG_CARD_READER_STATUS                  = (byte)0x20;
    /** Simple-TLV : Card ATR tag                                    = 0x21 */
    public static final byte TAG_CARD_ATR                            = (byte)0x21;
    /** Simple-TLV : C-APDU tag                                      = 0x22 */
    public static final byte TAG_C_APDU                              = (byte)0x22;
    /** Simple-TLV : R-APDU tag                                      = 0x23 */
    public static final byte TAG_R_APDU                              = (byte)0x23;
    /** Simple-TLV : Timer Identifier tag                            = 0x24 */
    public static final byte TAG_TIMER_IDENTIFIER                    = (byte)0x24;
    /** Simple-TLV : Timer Value tag                                 = 0x25 */
    public static final byte TAG_TIMER_VALUE                         = (byte)0x25;
    /** Simple-TLV : Date-Time and Time Zone tag                     = 0x26 */
    public static final byte TAG_DATE_TIME_AND_TIME_ZONE             = (byte)0x26;
    /** Simple-TLV : Call Control requested action tag               = 0x27 */
    public static final byte TAG_CALL_CONTROL_REQUESTED_ACTION       = (byte)0x27;
    /** Simple-TLV : AT Command tag                                  = 0x28 */
    public static final byte TAG_AT_COMMAND                          = (byte)0x28;
    /** Simple-TLV : AT Response tag                                 = 0x29 */
    public static final byte TAG_AT_RESPONSE                         = (byte)0x29;
    /** Simple-TLV : BC Repeat Indicator tag                         = 0x2A */
    public static final byte TAG_BC_REPEAT_INDICATOR                 = (byte)0x2A;
    /** Simple-TLV : Immediate response tag                          = 0x2B */
    public static final byte TAG_IMMEDIATE_RESPONSE                  = (byte)0x2B;
    /** Simple-TLV : DTMF string tag                                 = 0x2C */
    public static final byte TAG_DTMF_STRING                         = (byte)0x2C;

    /** Simple-TLV : mask to set the CR flag of any Simple-TLV tag   = 0x80 */
    public static final byte TAG_SET_CR                              = (byte)0x80;

    // ---------------------- Constants for findTLV method --------------------
    /** findTLV method result : if TLV is not found in the handler   = 0x00 */
    public static final byte TLV_NOT_FOUND                           = (byte)0;
    /** findTLV method result : if TLV is found with CR set          = 0x01 */
    public static final byte TLV_FOUND_CR_SET                        = (byte)1;
    /** findTLV method result : if TLV is found with CR not set      = 0x02 */
    public static final byte TLV_FOUND_CR_NOT_SET                    = (byte)2;

	// ------------------ Type of proactive command constants -----------------
    /** Type of proactive command : REFRESH                          = 0x01 */
    public static final byte PRO_CMD_REFRESH                         = (byte)0x01;
    /** Type of proactive command : MORE TIME                        = 0x02 */
    public static final byte PRO_CMD_MORE_TIME                       = (byte)0x02;
    /** Type of proactive command : SET UP CALL                      = 0x10*/
    public static final byte PRO_CMD_SET_UP_CALL                     = (byte)0x10;
    /** Type of proactive command : SEND SS                          = 0x11 */
    public static final byte PRO_CMD_SEND_SS                         = (byte)0x11;
    /** Type of proactive command : SEND USSD                        = 0x12 */
    public static final byte PRO_CMD_SEND_USSD                       = (byte)0x12;
    /** Type of proactive command : SEND SHORT MESSAGE               = 0x13 */
    public static final byte PRO_CMD_SEND_SHORT_MESSAGE              = (byte)0x13;
    /** Type of proactive command : SEND DTMF                        = 0x14 */
    public static final byte PRO_CMD_SEND_DTMF                       = (byte)0x14;
    /** Type of proactive command : PLAY TONE                        = 0x20 */
    public static final byte PRO_CMD_PLAY_TONE                       = (byte)0x20;
    /** Type of proactive command : DISPLAY TEXT                     = 0x21 */
    public static final byte PRO_CMD_DISPLAY_TEXT                    = (byte)0x21;
    /** Type of proactive command : GET INKEY                        = 0x22 */
    public static final byte PRO_CMD_GET_INKEY                       = (byte)0x22;
    /** Type of proactive command : GET INPUT                        = 0x23 */
    public static final byte PRO_CMD_GET_INPUT                       = (byte)0x23;
    /** Type of proactive command : SELECT ITEM                      = 0x24 */
    public static final byte PRO_CMD_SELECT_ITEM                     = (byte)0x24;
    /** Type of proactive command : PROVIDE LOCAL INFORMATION        = 0x26 */
    public static final byte PRO_CMD_PROVIDE_LOCAL_INFORMATION       = (byte)0x26;
    /** Type of proactive command : TIMER MANAGEMENT                 = 0x27 */
    public static final byte PRO_CMD_TIMER_MANAGEMENT                = (byte)0x27;
    /** Type of proactive command : SET UP IDLE MODE TEXT            = 0x28 */
    public static final byte PRO_CMD_SET_UP_IDLE_MODE_TEXT           = (byte)0x28;
    /** Type of proactive command : PERFORM CARD APDU                = 0x30 */
    public static final byte PRO_CMD_PERFORM_CARD_APDU               = (byte)0x30;
    /** Type of proactive command : POWER ON CARD                    = 0x31 */
    public static final byte PRO_CMD_POWER_ON_CARD                   = (byte)0x31;
    /** Type of proactive command : POWER OFF CARD                   = 0x32 */
    public static final byte PRO_CMD_POWER_OFF_CARD                  = (byte)0x32;
    /** Type of proactive command : GET READER STATUS                = 0x33 */
    public static final byte PRO_CMD_GET_READER_STATUS               = (byte)0x33;
    /** Type of proactive command : RUN AT COMMAND                   = 0x34 */
    public static final byte PRO_CMD_RUN_AT_COMMAND                  = (byte)0x34;

	// ----------------------- Device Identity constants ----------------------
    /** Device Identity : Keypad                                     = 0x01 */
    public static final byte DEV_ID_KEYPAD                           = (byte)0x01;
    /** Device Identity : Display                                    = 0x02 */
    public static final byte DEV_ID_DISPLAY                          = (byte)0x02;
    /** Device Identity : Earpiece                                   = 0x03 */
    public static final byte DEV_ID_EARPIECE                         = (byte)0x03;
    /** Device Identity : Additional Card Reader 0                   = 0x10 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_0         = (byte)0x10;
    /** Device Identity : Additional Card Reader 1                   = 0x11 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_1         = (byte)0x11;
    /** Device Identity : Additional Card Reader 2                   = 0x12 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_2         = (byte)0x12;
    /** Device Identity : Additional Card Reader 3                   = 0x13 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_3         = (byte)0x13;
    /** Device Identity : Additional Card Reader 4                   = 0x14 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_4         = (byte)0x14;
    /** Device Identity : Additional Card Reader 5                   = 0x15 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_5         = (byte)0x15;
    /** Device Identity : Additional Card Reader 6                   = 0x16 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_6         = (byte)0x16;
    /** Device Identity : Additional Card Reader 7                   = 0x17 */
    public static final byte DEV_ID_ADDITIONAL_CARD_READER_7         = (byte)0x17;
    /** Device Identity : SIM                                        = 0x81 */
    public static final byte DEV_ID_SIM                              = (byte)0x81;
    /** Device Identity : ME                                         = 0x82 */
    public static final byte DEV_ID_ME                               = (byte)0x82;
    /** Device Identity : Network                                    = 0x83 */
    public static final byte DEV_ID_NETWORK                          = (byte)0x83;


	// ---------------- Data Coding Scheme (GSM03.38) constants ---------------
    /** Data Coding Scheme : GSM Default Aphabet                     = 0x00 */
    public static final byte DCS_DEFAULT_ALPHABET                    = (byte)0x00;
    /** Data Coding Scheme : GSM 8 bit Data                          = 0x04 */
    public static final byte DCS_8_BIT_DATA                          = (byte)0x04;
    /** Data Coding Scheme : UCS2                                    = 0x08 */
    public static final byte DCS_UCS2                                = (byte)0x08;

	// -------------------- Status Word for SMS datadownload  -----------------
    /** Status Word 1 : use RP_ERROR channel                         = 0x9E */
    public static final byte SW1_RP_ERROR     						 = (byte)0x9E;
    /** Status Word 1 : use RP_ACK channel                           = 0x9F */
    public static final byte SW1_RP_ACK     						 = (byte)0x9F;

	// -------------------------- Poll Interval Constants ---------------------
    /** Poll Interval : request to deregister from proactive polling = 0    */
    public static final byte POLL_NO_DURATION						 = 0;
    /** Poll Interval : request the system duration   				 = -1   */
    public static final byte POLL_SYSTEM_DURATION     				 = -1;

}
