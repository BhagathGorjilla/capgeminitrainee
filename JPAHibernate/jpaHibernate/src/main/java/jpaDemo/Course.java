package jpaDemo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CourseMTOBi")
public class Course implements Serializable {
	@Id
	private int id;
	private String name;
	private double price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Teacher teacher;

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", price=" + price + ", teacher=" + teacher + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		return true;
	}

	public Course(int id, String name, double price, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.teacher = teacher;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
