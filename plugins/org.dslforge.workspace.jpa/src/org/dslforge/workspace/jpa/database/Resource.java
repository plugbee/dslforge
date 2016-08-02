/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workspace.jpa.database;

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
	private User locker;
	
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
	
	public User getLocker() {
		return locker;
	}
	
	public void setLocker(User user) {
		this.locker = user;
	}
	
	@Override
	public String toString() {
		return "Resource [guid=" + guid +
				"\n\t, project=" + project.toString() +
				"\n\t, path=" + path + 
				"\n\t, status=" + status + 
				(locker!=null?"\n\t, locker=" + locker.toString():"")+
				"\n]";
	}
}
