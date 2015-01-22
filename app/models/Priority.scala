package models

import javax.persistence.{Column, Entity, Id}

import play.db.ebean.Model

@Entity
class Priority(aId: Int, aName: String) extends Model {

	@Id
	val id: Int = aId

	@Column(name = "name")
	val name: String = aName

	def sdjkkasdj = println("sdfhjkls")

}
