//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The <code>ToolkitRegistry</code> class offers basic services and methods to allow
 * any Toolkit applet to register its configuration (supported events) during
 * the install phase and possibly to change it during all the applet life time.
 * Each toolkit applet will get a reference to its registry entry with the static 
 * method <code>getEntry</code>. The initial state of all the events is cleared.<p>
 *
 * Note: the constants related to the events are defined in the <code>ToolkitConstants
 * </code> interface.<p>
 *
 * Example of use:<pre><code>
 * public class MyToolkitApplet extends Applet implements ToolkitInterface, ToolkitConstants {
 *     // data fields
 *     private ToolkitRegistry reg;
 *     private byte[] menuEntry = { ... };
 *     private byte menuId;
 *     //
 *     // Constructor of applet
 *     //
 *     public MyToolkitApplet() {
 *         // get the reference of the applet ToolkitRegistry object ...
 *         reg = ToolkitRegistry.getEntry();
 *         // ...and initialize it according to the applet characteristics
 *         menuId = reg.initMenuEntry(menuEntry, (short)0, (short)menuEntry.length,
 *                                      PRO_CMD_SET_UP_CALL, false, 0, 0);
 *         reg.disableMenuEntry(menuId);
 *		   reg.setEvent(EVENT_FORMATTED_SMS_PP_ENV);
 *         reg.setEvent(EVENT_CALL_CONTROL_BY_SIM);
 *     }
 *     //
 *     // Install method
 *     // *param bArray the array containing installation parameters
 *     // *param bOffset the starting offset in bArray
 *     // *param bLength the length in bytes of the parameter data in bArray
 *     //
 *     public static void install(byte bArray[], short bOffset, byte bLength) throws ISOException {
 *         // create and register applet
 *         MyToolkitApplet applet = new MyToolkitApplet();
 *         applet.register();
 *     }
 *     //
 *     // Process toolkit events
 *     // *param event the type of event to be processed
 *     // *exception ToolkitException
 *     //
 *     public void processToolkit(byte event) throws ToolkitException {
 *         if (event == EVENT_FORMATTED_SMS_PP_ENV) {
 *             reg.enableMenuEntry(menuId);
 *         } else if (event == EVENT_MENU_SELECTION) {
 *             //...
 *         }
 *     }
 * }
 * </code></pre>
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF
 *
 * @see ToolkitInterface
 * @see ToolkitException
 * @see ToolkitConstants
 */
public final class ToolkitRegistry {

    // ------------------------------- Constructors ---------------------------
    /**
     * Constructor
     */
    private ToolkitRegistry() {
    }

	// ------------------------------- Public methods -------------------------
    /**
     * This method is used by the Toolkit applet to get a reference to its 
     * Toolkit Registry entry, so that it can handle its registration state to 
     * the toolkit events.
     *
     * @return reference to the applet ToolkitRegistry object
	 *
     * @exception ToolkitException with the following reason codes: <ul>
     * 		<li>REGISTRY_ERROR in case of register error</ul>
     */
    public static ToolkitRegistry getEntry() throws ToolkitException {
        return null;
	}


    /**
     * Sets an event in the Toolkit Registry.
     *
     * @param event value of the new event to register (between 0 and 255)
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>EVENT_NOT_SUPPORTED if the event is not supported
     *      <li>EVENT_ALREADY_REGISTERED if the event has already been registered
     *         (for limited event like Call Control)
     *		<li>EVENT_NOT_ALLOWED if event is EVENT_MENU_SELECTION, 
     *			EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND</ul>
     */
    public void setEvent(byte event) throws ToolkitException {
    }

     /**
     * Sets an event list in the Toolkit Registry.
     *
     * @param eventList buffer containing thelist of the new events to register
     * @param offset offset in the eventlist buffer for event registration
     * @param length length in the eventlist buffer for event registration
     *
     * @exception NullPointerException if <code>eventlist</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>EVENT_NOT_SUPPORTED if one event is not supported
     *      <li>EVENT_ALREADY_REGISTERED if one event has already been registered
     *         (for limited event like Call Control)
     *		<li>EVENT_NOT_ALLOWED if eventList contains EVENT_MENU_SELECTION, 
     *			EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND</ul>
     */
    public void setEventList(byte[] eventList, 
    							short offset, 
    							short length) throws NullPointerException,
                                                     ArrayIndexOutOfBoundsException,
                                                     ToolkitException {
    }

    /**
     * Clears an event in the Toolkit Registry.
     *
     * @param event the value of the event to unregister (between 0 and 255)
     * @exception ToolkitException with the following reason codes: <ul>
     *		<li>EVENT_NOT_ALLOWED if event is EVENT_MENU_SELECTION, 
     *			EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND</ul>
     */
    public void clearEvent(byte event) throws ToolkitException {
    }

    /**
     * Allows to know if an event is set in the Toolkit Registry.
     *
     * @param event the value of the event (between 0 and 255)
     *
     * @return true if the event is set in the Toolkit Registry, false otherwise
     */
    public boolean isEventSet(byte event) {
        return false;
    }

    /**
     * Disables a menu entry.
     *
     * @param id the menu entry identifier supplied by the <code>initMenuEntry()</code> method
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>ENTRY_NOT_FOUND if the menu entry does not exist for this applet</ul>
     */
    public void disableMenuEntry(byte id) throws ToolkitException {
    }

    /**
     * Enables a menu entry.
     *
     * @param id the menu entry identifier supplied by the <code>initMenuEntry()</code> method
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>ENTRY_NOT_FOUND if the menu entry does not exist for this applet</ul>
     */
    public void enableMenuEntry(byte id) throws ToolkitException {
    }

    /**
     * Initialises the next menu entry allocated at loading. The default state of the menu entry is
     * 'enabled'. The value of the <code>helpSupported</code> boolean parameter
     * defines the registration status of the applet to the event
     * EVENT_MENU_SELECTION_HELP_REQUEST. The applet automatically registers to
     * the EVENT_MENU_SELECTION. The icon identifier provided will be added to
     * the icon identifier list of the item icon identifier list Simple TLV if
     * all the applets registered to the EVENT_MENU_SELECTION provide it.
     * The Icon list qualifier transmitted to the ME will be 'icon is not self
     * explanatory' if one of the applet registered prefers this qualifier.
	 * This method shall be called by the applet in the same order than the 
	 * order of the item parameters defined at the applet loading if the applet
	 * has several menu entries. The applet shall initialise all its loaded 
	 * menu entries during its installation.
     *
     * @param menuEntry a reference on a byte array, containing the menu entry string
     * @param offset offset of the menu entry string in the buffer
     * @param length length of the menu entry string
     * @param nextAction a byte coding the next action indicator for the menu entry (or 0)
     * @param helpSupported equals true if help is available for the menu entry
     * @param iconQualifier the preferred value for the icon list qualifier
     * @param iconIdentifier the icon identifier for the menu entry  (0 means no icon)
     *
     * @return the identifier attached to the initialised menu entry
     *
     * @exception NullPointerException if <code>menuEntry</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>REGISTRY_ERROR if the menu entry cannot be initialised (eg no more item data in applet loading parameter)
	 *		<li>OUT_OF_ITEM_BOUNDARIES if the menu entry string is bigger than the alloacted space</ul>
     */
    public byte initMenuEntry(byte[] menuEntry,
                                short offset,
                                short length,
                                byte nextAction,
                                boolean helpSupported,
                                byte iconQualifier,
                                short iconIdentifier) throws NullPointerException,
                                                     		 ArrayIndexOutOfBoundsException,
                                                     		 ToolkitException {
        return 0;
    }

    /**
     * Changes the value of a menu entry. The default state of the changed menu
     * entry is 'enabled'. The value of the <code>helpSupported</code> boolean
     * parameter defines the registration status of the EVENT_MENU_SELECTION_HELP_REQUEST
     * event. The icon identifier provided will be added to the icon identifier list
     * of the item icon identifier list Simple TLV if all the applets registered
     * to the EVENT_MENU_SELECTION provide it.
     * The Icon list qualifier transmitted to the ME will be 'icon is not self
     * explanatory' if one of the applet registered prefers this qualifier.
     *
     * @param id the menu entry identifier supplied by the <code>initMenuEntry()</code> method
     * @param menuEntry a reference on a byte array, containing the menu entry string
     * @param offset the position of the menu entry string in the buffer
     * @param length the length of the menu entry string
     * @param nextAction a byte coding the next action indicator for the menu entry (or 0)
     * @param helpSupported equals true if help is available for the menu entry
     * @param iconQualifier the preferred value for the icon list qualifier
     * @param iconIdentifier the icon identifier for the menu entry  (0 means no icon)
     *
     * @exception NullPointerException if <code>menuEntry</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>ENTRY_NOT_FOUND if the menu entry does not exist for this applet
	 *		<li>OUT_OF_ITEM_BOUNDARIES if the menu entry string is bigger than the alloacted space</ul>
     */
    public void changeMenuEntry(byte id,
                                byte[] menuEntry,
                                short offset,
                                short length,
                                byte nextAction,
                                boolean helpSupported,
                                byte iconQualifier,
                                short iconIdentifier) throws NullPointerException,
                                                     		 ArrayIndexOutOfBoundsException,
                                                     		 ToolkitException {
    }

    /**
     * Asks the Toolkit framework to allocate a Timer that the applet can manage.
     * By calling this method the applet automatically registers to the
     * EVENT_TIMER_EXPIRATION of the allocated timer.
     * The timer is allocated by the applet until it explicitly releases it.
	 * So it can then issue the Timer Management proactive command to start, 
	 * stop or get the value of its allocated timer.
     *
     * @return the identifier of the Timer allocated to the applet
     *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>NO_TIMER_AVAILABLE if all the timers are allocated or the maximum number 
     *		of timers have been allocated to this applet</ul>
     */
    public byte allocateTimer() throws ToolkitException {
        return 0;
    }

    /**
     * Release a Timer that has been allocated to the calling applet.
     * The applet automatically deregister of the EVENT_TIMER_EXPIRATION
     * for the indicated Timer Identifier.
     *
     * @param timerIdentifier the identifier of the Timer to be released
	 * 
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>INVALID_TIMER_ID if the timerIdentifierd is not allocated to this applet.</ul>
     */
    public void releaseTimer(byte timerIdentifier) throws ToolkitException {
    }


	/**
	 * Requests a duration for the EVENT_STATUS_COMMAND event of the registering 
	 * toolkit applet. Due to different duration requested by other toolkit 
	 * applets or due to restriction of the ME, the SIM Toolkit Framework may 
	 * adjust another duration. 
	 * This method can be used at every time to request a new duration.
	 *
	 * @param duration specifies the number of seconds requested for proactive polling.
	 *			The maximum value of <code>duration</code> is <code>15300</code> (255 minutes).
	 *			If <code>duration<code> is equal to <code>POLL_NO_DURATION</code>, 
	 *			the calling applet deregisters from EVENT_STATUS_COMMAND, and 
	 *			the SIM Toolkit Framework may issue the POLLING OFF proactive command.
	 *			If <code>duration<code> is equal to <code>POLL_SYSTEM_DURATION</code>, 
	 *			the calling applet registers to the EVENT_STATUS_COMMAND and let
	 *			the SIM Toolkit Framework define the duration.
	 *
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>REGISTRY_ERROR 	 if <code>duration</code> is greater than the maximum value.</ul>
	 */
	public void requestPollInterval(short duration) throws ToolkitException {
	}


	/**
	 * Returns the number of seconds of the adjusted duration for the calling 
	 * toolkit applet.
	 * If the returned duration is equal to <code>POLL_NO_DURATION<code>, the toolkit 
	 * applet is not registered to EVENT_STATUS_COMMAND event.
	 * The returned duration may : 
	 *		- be a multiple of the real adjusted poll interval time at the ME.
	 * 		- differ from the requested duration due to request of other toolkit 
	 *			applets or due to restrictions of the current ME.
	 *		- be changed during the card session due requests from other toolkit applets.
	 *		- be wrong due to direct generation of the proactive command POLL INTERVAL or POLLING OFF.
	 * 		- not correspond to the ellasped time due to additional STATUS commands send by the ME.
	 *
	 * @return the number of seconds of the adjusted duration for the applet
	 */

	public short getPollInterval() {
        return 0;
	}

}
