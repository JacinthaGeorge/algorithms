/*
 * Pair.java
 */

package org.rododin.algorithms.structures;

/**
 * Description.
 * @author Rod Odin
 */
public interface Pair <First, Second>
{
  First getFirst();
  void setFirst(First first);

  Second getSecond();
  void setSecond(Second second);
}
