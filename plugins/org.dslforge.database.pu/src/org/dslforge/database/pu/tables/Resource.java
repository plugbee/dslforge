package org.dslforge.database.pu.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="df_resource")
public class Resource {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String guid;
	
	private String path = null;

	private String status = null;
	
	private Project project;
	
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@ManyToOne
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	@Override
	public String toString() {
		return "Resource [guid=" + guid + 
				", path=" + path + 
				", status=" + status + 
				"]";
	}
}
