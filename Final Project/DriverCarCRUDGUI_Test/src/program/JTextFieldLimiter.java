/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Jefferson
 */
public class JTextFieldLimiter extends PlainDocument { // Class limited number of characters that can be entered in jtextfield
  private int limit;
  JTextFieldLimiter(int limit) {
   super();
   this.limit = limit; // Returns the limit
   }
  public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
    if (str == null) // If string is empty, nothing happens
        return;
    if ((getLength() + str.length()) <= limit) { // If string does not exceed the limit, string gets used
      super.insertString(offset, str, attr);
    }
  }
}
