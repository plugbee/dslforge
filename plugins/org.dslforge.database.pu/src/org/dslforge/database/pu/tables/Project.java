package org.dslforge.database.pu.tables;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="df_project")
public class Project extends Folder {
	
	protected User user;
	
	protected String visibility;
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public String getVisibility() {
		return visibility;
	}
	
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + getId()+ 
				", name=" + name + 
				", description=" + description + 
				", path=" + path + 
				", user=" + user + 
				", visibility=" + visibility + 
				"]";
	}
}
