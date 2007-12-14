/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2t.common.recipe.ui.shared.messages;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author lom
 *
 * This class manages reading messages.
 * Messages are stored in DialogMessages.properties
 *
 */
public class DialogMessages
{
  /**
   * A ResourceBundle that contains messages
   */
  private static ResourceBundle cvResourceBundle= ResourceBundle.getBundle (DialogMessages.class.getName ());

  /**
   * Gets a message from ResourceBundle
   *
   * @param aKey 			A key associated with a message
   * @return	A message for a given key. If an exception occured, a given key is returned
   */
  public static String getMessage (String aKey)
  {
    try
    {
      return cvResourceBundle.getString (aKey);
    }
    catch (MissingResourceException e)
    {
      return aKey;
    }
  }
}
