//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package sim.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The <code>MEProfile</code> class contains methods to question the handset
 * profile, regarding the SIM Application Toolkit and supposing that this
 * profile has been set by the <b>Terminal Profile</b> APDU command.
 * The following table gives the index value according to the facility to
 * check. This class contains only static methods, no instance of this class is
 * necessary.<p>
 *
 * <br><br><Table Border="1" Cellpadding="3"><tr bgcolor=#c0c0c0 align=center>
 *     <td> <b>Facility</b>                                  </td><td> <b>Index</b> </td></tr>
 * <tr><td> Profile download                                 </td><td>    0         </td></tr>
 * <tr><td> SMS-PP data download                             </td><td>    1         </td></tr>
 * <tr><td> Cell Broadcast data download                     </td><td>    2         </td></tr>
 * <tr><td> Menu selection                                   </td><td>    3         </td></tr>
 * <tr><td> '9E xx' response code for SIM data download error</td><td>    4         </td></tr>
 * <tr><td> Timer Expiration                                 </td><td>    5         </td></tr>
 * <tr><td> USSD string data object supported in Call Control</td><td>    6         </td></tr>
 * <tr><td> RFU                                              </td><td>    7         </td></tr>
 * <tr><td> command result                                   </td><td>    8         </td></tr>
 * <tr><td> Call Control by SIM                              </td><td>    9         </td></tr>
 * <tr><td> Cell identity included in Call Control by SIM    </td><td>    10        </td></tr>
 * <tr><td> MO short message control by SIM                  </td><td>    11        </td></tr>
 * <tr><td> Handling of the alpha identifier, user indication</td><td>    12        </td></tr>
 * <tr><td> UCS2 Entry supported                             </td><td>    13        </td></tr>
 * <tr><td> UCS2 Display supported                           </td><td>    14        </td></tr>
 * <tr><td> Display of the extension Text                    </td><td>    15        </td></tr>
 * <tr><td> Proactive SIM: Display Text                      </td><td>    16        </td></tr>
 * <tr><td> Proactive SIM: Get Inkey                         </td><td>    17        </td></tr>
 * <tr><td> Proactive SIM: Get Input                         </td><td>    18        </td></tr>
 * <tr><td> Proactive SIM: More Time                         </td><td>    19        </td></tr>
 * <tr><td> Proactive SIM: Play Tone                         </td><td>    20        </td></tr>
 * <tr><td> Proactive SIM: Poll Interval                     </td><td>    21        </td></tr>
 * <tr><td> Proactive SIM: Polling Off                       </td><td>    22        </td></tr>
 * <tr><td> Proactive SIM: Refresh                           </td><td>    23        </td></tr>
 * <tr><td> Proactive SIM: Select Item                       </td><td>    24        </td></tr>
 * <tr><td> Proactive SIM: Send Short Message                </td><td>    25        </td></tr>
 * <tr><td> Proactive SIM: Send SS                           </td><td>    26        </td></tr>
 * <tr><td> Proactive SIM: Send USSD                         </td><td>    27        </td></tr>
 * <tr><td> Proactive SIM: Set Up Call                       </td><td>    28        </td></tr>
 * <tr><td> Proactive SIM: Set Up Menu                       </td><td>    29        </td></tr>
 * <tr><td> Proactive SIM: Provide Local Information         </td><td>    30        </td></tr>
 * <tr><td> Proactive SIM: Provide Local Information (NMR)   </td><td>    31        </td></tr>
 * <tr><td> Proactive SIM: Set Up Event List                 </td><td>    32        </td></tr>
 * <tr><td> Event: MT call                                   </td><td>    33        </td></tr>
 * <tr><td> Event: Call connected                            </td><td>    34        </td></tr>
 * <tr><td> Event: Call disconnected                         </td><td>    35        </td></tr>
 * <tr><td> Event: Location status                           </td><td>    36        </td></tr>
 * <tr><td> Event: User activity                             </td><td>    37        </td></tr>
 * <tr><td> Event: Idle screen available                     </td><td>    38        </td></tr>
 * <tr><td> Event: Card reader status                        </td><td>    39        </td></tr>
 * <tr><td> RFU                                              </td><td>    40        </td></tr>
 * <tr><td> RFU                                              </td><td>    41        </td></tr>
 * <tr><td> RFU                                              </td><td>    42        </td></tr>
 * <tr><td> RFU                                              </td><td>    43        </td></tr>
 * <tr><td> RFU                                              </td><td>    44        </td></tr>
 * <tr><td> RFU                                              </td><td>    45        </td></tr>
 * <tr><td> RFU                                              </td><td>    46        </td></tr>
 * <tr><td> RFU                                              </td><td>    47        </td></tr>
 * <tr><td> Proactive SIM : Power ON Card                    </td><td>    48        </td></tr>
 * <tr><td> Proactive SIM : Power OFF Card                   </td><td>    49        </td></tr>
 * <tr><td> Proactive SIM : Perform Card APDU                </td><td>    50        </td></tr>
 * <tr><td> Proactive SIM : Get Reader Status                </td><td>    51        </td></tr>
 * <tr><td> RFU                                              </td><td>    52        </td></tr>
 * <tr><td> RFU                                              </td><td>    53        </td></tr>
 * <tr><td> RFU                                              </td><td>    54        </td></tr>
 * <tr><td> RFU                                              </td><td>    55        </td></tr>
 * <tr><td> Proactive SIM : Timer Management (start, stop)   </td><td>    56        </td></tr>
 * <tr><td> Proactive SIM : Timer Management (get cur. value)</td><td>    57        </td></tr>
 * <tr><td> Proactive SIM : Provide Local Info (date,time...)</td><td>    58        </td></tr>
 * <tr><td> Binary choice in Get Inkey                       </td><td>    59        </td></tr>
 * <tr><td> Set Up Idle Mode Text                            </td><td>    60        </td></tr>
 * <tr><td> Run AT Command                                   </td><td>    61        </td></tr>
 * <tr><td> 2nd Alpha Id in Set Up Call                      </td><td>    62        </td></tr>
 * <tr><td> 2nd Capability configuration par. in Call Control</td><td>    63        </td></tr>
 * <tr><td> Sustained Display Text                           </td><td>    64        </td></tr>
 * <tr><td> Send DTMF                                        </td><td>    65        </td></tr>
 * <tr><td> RFU                                              </td><td>    66        </td></tr>
 * <tr><td> RFU                                              </td><td>    67        </td></tr>
 * <tr><td> RFU                                              </td><td>    68        </td></tr>
 * <tr><td> RFU                                              </td><td>    69        </td></tr>
 * <tr><td> RFU                                              </td><td>    70        </td></tr>
 * <tr><td> RFU                                              </td><td>    71        </td></tr>
 * </Table><br>
 *
 * Example of use in a standard Toolkit applet:<pre><code>
 * private static final byte PROFILE_USSD = (byte)27;
 *
 * if (MEProfile.check(PROFILE_USSD) == true) {
 *     // USSD available on the handset
 *     sendTheRequest();
 * } else {
 *     // abort applet
 *     return;
 * }
 * </code></pre>
 *
 * @version 7.0.0 - 10/06/99
 * @author ETSI SMG9 SIM API WP, JCF SIM API TF
 */
public final class MEProfile {

    // ------------------------------- Constructors ---------------------------
    /**
     * constructor
     */
    private MEProfile() {
    }


    // ------------------------------- Public methods -------------------------
    /**
     * Checks a facility in the handset profile.
     *
     * @param index the number of the facility to check, according to the table above.
     *
     * @return true if the facility is supported, false otherwise
     *
     * @exception ToolkitException  with the following reason codes: <ul>
     *      <li>ME_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available</ul>
     */
    public static boolean check(byte index) throws ToolkitException {
    }

    /**
     * Checks a set of facilities in the handset profile.
     * The method checks all the facilities corresponding to bits set to 1 in
     * the mask buffer.
     *
     * @param mask a byte array containing the mask to compare with the profile
     * @param offset the starting offset of the mask in the byte array
     * @param length the length of the mask (at least 1)
     *
     * @return true if the set of facilities is supported, false otherwise
     *
     * @exception NullPointerException if <code>mask</code> is <code>null</code>
     * @exception ArrayIndexOutOfBoundsException if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
     * @exception ToolkitException with the following reason codes: <ul>
     *      <li>ME_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available</ul>
     */
    public static boolean check(byte[] mask,
                                short offset,
                                short length) throws NullPointerException,
                                                     ArrayIndexOutOfBoundsException,
                                                     ToolkitException {
    }
}
