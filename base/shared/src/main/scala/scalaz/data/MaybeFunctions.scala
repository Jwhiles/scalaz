package scalaz
package data

trait MaybeFunctions {
  type Maybe[A] = Option[A]

  def empty[A]: Maybe[A]
  def just[A](a: A): Maybe[A]
  def maybe[A, B](n: B)(f: A => B): Maybe[A] => B
  def fromOption[A](oa: Option[A]): Maybe[A]
  def toOption[A](ma: Maybe[A]): Option[A]
}
