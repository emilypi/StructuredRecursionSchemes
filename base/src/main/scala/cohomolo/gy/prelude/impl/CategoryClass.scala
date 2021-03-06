package cohomolo.gy

package prelude

package impl

import typeclass.{ Category, Compose }

trait CategoryClass[=>:[_, _]] extends Category[=>:] with Compose[=>:] {
  def compose: Compose[=>:] = this
  def id[A]: A =>: A
}
